
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
object productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[model.ProductInfo,Option[model.Price],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: model.ProductInfo, price: Option[model.Price]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Product Details")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<h2>Product Details: """),_display_(/*5.23*/product/*5.30*/.name),format.raw/*5.35*/("""</h2>

<h3>Price: """),_display_(/*7.13*/price/*7.18*/.getOrElse("Price not available")),format.raw/*7.51*/("""</h3>

<ul>
    """),_display_(/*10.6*/product/*10.13*/.attributes.map/*10.28*/ { attribute =>_display_(Seq[Any](format.raw/*10.43*/("""
        """),format.raw/*11.9*/("""<li>"""),_display_(/*11.14*/attribute/*11.23*/._1),format.raw/*11.26*/(""" """),format.raw/*11.27*/("""= """),_display_(/*11.30*/attribute/*11.39*/._2),format.raw/*11.42*/(""" """),format.raw/*11.43*/("""</li>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</ul>
""")))}))}
  }

  def render(product:model.ProductInfo,price:Option[model.Price]): play.twirl.api.HtmlFormat.Appendable = apply(product,price)

  def f:((model.ProductInfo,Option[model.Price]) => play.twirl.api.HtmlFormat.Appendable) = (product,price) => apply(product,price)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 22:41:40 EST 2016
                  SOURCE: /Users/iWill/Work/Scala Test 2 - Store App/app/views/productDetails.scala.html
                  HASH: e75270c2730a528affa56de09b69e4f7d549a7c6
                  MATRIX: 545->1|689->57|717->60|748->83|787->85|815->87|863->109|878->116|903->121|948->140|961->145|1014->178|1057->195|1073->202|1097->217|1150->232|1186->241|1218->246|1236->255|1260->258|1289->259|1319->262|1337->271|1361->274|1390->275|1431->286|1459->287
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|32->11|32->11|32->11|32->11|32->11|32->11|32->11|32->11|32->11|33->12|34->13
                  -- GENERATED --
              */
          