package foo.bar

import org.scalatest.FunSuite

class ValidTestWithoutTag extends FunSuite {

  private val a1 = 10
  private val a2 = 10

  test("dummy valid test without tag") {
    assertResult(20)(a1 + a2)
  }
}
