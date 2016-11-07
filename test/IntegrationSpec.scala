package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

/**
 * add your integration spec here.
 * An integration test will fire up a whole play application in a real (or headless) browser
 */
class IntegrationSpec extends Specification {
  
  "Application" should {
    
    "work from within a browser" in {
      running(TestServer(3333), HTMLUNIT) { browser =>

        browser.goTo("http://localhost:3333/")

        browser.pageSource must contain("Main product categories")

        browser.goTo("http://localhost:3333/category/frisbees")

        browser.pageSource must contain ("Frisbees")

        browser.goTo("http://localhost:3333/product/1")

        browser.pageSource must contain ("Invalid Product")

        browser.goTo("http://localhost:3333/category/frebe")

        browser.pageSource must contain ("Invalid Category")

        browser.goTo("http://localhost:3333/product/553")

        browser.pageSource must contain ("Jameson")
       
      }
    }
    
  }
  
}