package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class ApplicationSpec extends Specification {

  
  "Application" should {
    
    "send 404 on a bad request" in {
      running(FakeApplication()) {
        route(FakeRequest(GET, "/boum")) must beNone        
      }
    }
    
    "render the index page" in {
      running(FakeApplication()) {
        val home = route(FakeRequest(GET, "/")).get
        
        status(home) must equalTo(OK)
        contentType(home) must beSome.which(_ == "text/html")
        contentAsString(home) must contain ("Welcome to My Store")
      }
    }

    "render the categories page" in {
      running(FakeApplication()) {
        val categoriesPage = route(FakeRequest(GET, "/category/frisbees")).get

        status(categoriesPage) must equalTo(OK)
        contentType(categoriesPage) must beSome.which(_ == "text/html")
        contentAsString(categoriesPage) must contain ("Frisbees")
      }
    }

    "render 404 if invalid categories" in {
      running(FakeApplication()) {
        val categoriesPage = route(FakeRequest(GET, "/category/frebe")).get

        status(categoriesPage) must equalTo(NOT_FOUND)
      }
    }

    "render product details page" in {
      running(FakeApplication()) {
        val productDetails = route(FakeRequest(GET, "/product/553")).get

        status(productDetails) must equalTo(OK)
        contentType(productDetails) must beSome.which(_ == "text/html")
        contentAsString(productDetails) must contain ("Jameson")
      }
    }

    "render 404 if invalid product" in {
      running(FakeApplication()) {
        val productDetails = route(FakeRequest(GET, "/product/1")).get

        status(productDetails) must equalTo(NOT_FOUND)
      }
    }
  }
}