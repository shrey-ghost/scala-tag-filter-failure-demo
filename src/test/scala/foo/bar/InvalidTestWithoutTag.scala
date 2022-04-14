package foo.bar

import org.scalatest.FunSuite

class InvalidTestWithoutTag extends FunSuite {

  private var arr: Array[Int] = Array(10, 10)
  private val a1 = arr(0)
  private val a2 = arr(1)

  arr = null

  // this should trigger NullPointerException
  private val a3 = arr(0)


  test("dummy invalid passing test without tag") {
    assertResult(20)(a1 + a2)
  }

  test("dummy invalid failing test without tag") {
    assertResult(20)(a1 + a3)
  }
}
