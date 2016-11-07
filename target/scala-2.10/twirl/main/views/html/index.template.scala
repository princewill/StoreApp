
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[model.ProductCategory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: Seq[model.ProductCategory]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Welcome to My Store")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

"""),format.raw/*5.1*/("""<h1>Main product categories</h1>
<ul>
"""),_display_(/*7.2*/for(productCategory <- categories) yield /*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
    """),format.raw/*8.5*/("""<li>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.Application.category(productCategory.id)),format.raw/*9.66*/("""">"""),_display_(/*9.69*/productCategory/*9.84*/.name),format.raw/*9.89*/("""</a>
    </li>
""")))}),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</ul>

""")))}),format.raw/*14.2*/("""
"""))}
  }

  def render(categories:Seq[model.ProductCategory]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((Seq[model.ProductCategory]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 19:04:03 EST 2016
                  SOURCE: /Users/iWill/Work/Scala Test 2 - Store App/app/views/index.scala.html
                  HASH: 7f6932c7d55139bd4a05d967225e91246cca9fb3
                  MATRIX: 525->1|653->41|681->44|716->71|755->73|783->75|847->114|896->148|935->150|966->155|1015->178|1029->184|1090->225|1119->228|1142->243|1167->248|1213->264|1241->265|1279->273
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|28->7|28->7|28->7|29->8|30->9|30->9|30->9|30->9|30->9|30->9|32->11|33->12|35->14
                  -- GENERATED --
              */
          