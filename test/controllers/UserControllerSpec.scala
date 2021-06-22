package controllers

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.test.Injecting

class UserControllerSpec extends WordSpec with GuiceOneAppPerTest with Injecting with Matchers {

	"UserController" can {
		"CREATE User" should {
			"succeed" in {

			}

			"fail" in {

			}
		}
	}
}
