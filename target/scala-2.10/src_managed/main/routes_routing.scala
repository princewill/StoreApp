// @SOURCE:/Users/iWill/Work/Scala Test 2 - Store App/conf/routes
// @HASH:4e1dcd8d5890b82b46152ff10810a382b6610ca4
// @DATE:Mon Nov 07 01:46:00 EST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_category1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/"),DynamicPart("categoryId", """[^/]+""",true))))
private[this] lazy val controllers_Application_category1_invoker = createInvoker(
controllers.Application.category(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "category", Seq(classOf[String]),"GET", """""", Routes.prefix + """category/$categoryId<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_productDetails2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/"),DynamicPart("productId", """[^/]+""",true))))
private[this] lazy val controllers_Application_productDetails2_invoker = createInvoker(
controllers.Application.productDetails(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "productDetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """product/$productId<[^/]+>"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/$categoryId<[^/]+>""","""controllers.Application.category(categoryId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/$productId<[^/]+>""","""controllers.Application.productDetails(productId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_category1_route(params) => {
   call(params.fromPath[String]("categoryId", None)) { (categoryId) =>
        controllers_Application_category1_invoker.call(controllers.Application.category(categoryId))
   }
}
        

// @LINE:8
case controllers_Application_productDetails2_route(params) => {
   call(params.fromPath[String]("productId", None)) { (productId) =>
        controllers_Application_productDetails2_invoker.call(controllers.Application.productDetails(productId))
   }
}
        

// @LINE:13
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     