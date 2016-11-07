
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object categories extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Seq[model.ProductInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categoryName: String, products: Seq[model.ProductInfo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Product Category")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.1*/("""<h1>"""),_display_(/*5.6*/categoryName),format.raw/*5.18*/("""</h1>

<ul>
    """),_display_(/*8.6*/products/*8.14*/.map/*8.18*/ {product =>_display_(Seq[Any](format.raw/*8.30*/("""
    """),format.raw/*9.5*/("""<li>
        <a href=""""),_display_(/*10.19*/routes/*10.25*/.Application.productDetails(product.productId)),format.raw/*10.71*/("""">"""),_display_(/*10.74*/product/*10.81*/.name),format.raw/*10.86*/("""</a>
    </li>""")))}),format.raw/*11.11*/("""
"""),format.raw/*12.1*/("""</ul>
""")))}))}
  }

  def render(categoryName:String,products:Seq[model.ProductInfo]): play.twirl.api.HtmlFormat.Appendable = apply(categoryName,products)

  def f:((String,Seq[model.ProductInfo]) => play.twirl.api.HtmlFormat.Appendable) = (categoryName,products) => apply(categoryName,products)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 07 01:10:24 EST 2016
                  SOURCE: /Users/iWill/Work/Scala Test 2 - Store App/app/views/categories.scala.html
                  HASH: 169a77ee1f9325c66ffdc22f33ce421657f2eaac
                  MATRIX: 533->1|677->57|705->60|737->84|776->86|804->88|834->93|866->105|908->122|924->130|936->134|985->146|1016->151|1066->174|1081->180|1148->226|1178->229|1194->236|1220->241|1266->256|1294->257
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|29->8|29->8|29->8|29->8|30->9|31->10|31->10|31->10|31->10|31->10|31->10|32->11|33->12
                  -- GENERATED --
              */
          