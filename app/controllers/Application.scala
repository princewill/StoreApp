package controllers

import play.api.mvc._
import services._
import model.{CategoryId, ProductId, ProductInfo}
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import scala.concurrent.Future

class Application(productService: ProductService, priceService: PriceService) extends Controller {

  def index = Action.async {
    for {
      categories <- productService.categories
    } yield Ok(views.html.index(categories))
  }

  def category(id: CategoryId) = Action.async {
    for {
      productsInfo <- productService.category(id).map(opt => opt.map(seq => seq.map(prodId => productService.productDetails(prodId))))
      seqOfProductInfo <- productsInfo.map(opt => opt.foldLeft(Future.successful[Seq[Option[ProductInfo]]](Seq.empty))((a, b) => a.flatMap(seq => b.map(_ +: seq))).map(_.flatMap(_.toSeq))).getOrElse(Future.successful(Seq.empty))
      category <- productService.categories.map(_.find(_.id == id))
    } yield category match {
                        case Some(cat) => Ok(views.html.categories(cat.name, seqOfProductInfo))
                        case _      => NotFound("Invalid Category")
    }
  }

  def productDetails(id: ProductId) = Action.async {
    val productInfo = for {
      productDetails <- productService.productDetails(id)
                         .recoverWith {
                           case e: Exception => Future.failed(new Exception("An Error Occurred"))
                         }
      price <- priceService.price(id)
    } yield (productDetails, price)

    productInfo.map(p => p._1 match {
      case Some(a) => Ok(views.html.productDetails(a, p._2))
      case _ => NotFound("Invalid Product")
    })
  }

}

object Application extends Application(MockProductService, MockPriceService)