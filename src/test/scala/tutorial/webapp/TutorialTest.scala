package tutorial.webapp

import utest._

object TutorialTest extends TestSuite {

  def tests: Tests = Tests {
    test("HelloWorld") {
      println("good")
    }
  }
}
