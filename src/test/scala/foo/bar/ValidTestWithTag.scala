package foo.bar

import org.scalatest.FunSuite
import tags.MyNewTag

@MyNewTag
class ValidTestWithTag extends FunSuite {

  private val a1 = 10
  private val a2 = 10

  test("dummy valid test with tag") {
    assertResult(20)(a1 + a2)
  }
}
