// @SOURCE:/Users/iWill/Work/Scala Test 2 - Store App/conf/routes
// @HASH:4e1dcd8d5890b82b46152ff10810a382b6610ca4
// @DATE:Mon Nov 07 01:46:00 EST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {


// @LINE:13
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def productDetails(productId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product/" + implicitly[PathBindable[String]].unbind("productId", dynamicString(productId)))
}
                        

// @LINE:7
def category(categoryId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "category/" + implicitly[PathBindable[String]].unbind("categoryId", dynamicString(categoryId)))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
class ReverseAssets {


// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def productDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.productDetails",
   """
      function(productId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("productId", encodeURIComponent(productId))})
      }
   """
)
                        

// @LINE:7
def category : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.category",
   """
      function(categoryId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("categoryId", encodeURIComponent(categoryId))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:13
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {


// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def productDetails(productId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.productDetails(productId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "productDetails", Seq(classOf[String]), "GET", """""", _prefix + """product/$productId<[^/]+>""")
)
                      

// @LINE:7
def category(categoryId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.category(categoryId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "category", Seq(classOf[String]), "GET", """""", _prefix + """category/$categoryId<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    