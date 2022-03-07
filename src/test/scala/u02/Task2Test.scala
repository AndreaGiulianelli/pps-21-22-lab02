package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.task2.Task2.neg
import u02.task2.Task2.parity
import u02.task2.Task2.parityMeth

/**
 * I will test also the val, even if it's not properly correct.
 * Vals are more a private thing and usually are tested only the methods.
 */
class Task2Test {
  val empty: String => Boolean = _ == ""

  @Test def testParityEvenVal(): Unit =
    assertEquals("even", parity(2))

  @Test def testParityOddVal(): Unit =
    assertEquals("odd", parity(3))

  @Test def testParityEvenMeth(): Unit =
    assertEquals("even", parityMeth(2))

  @Test def testParityOddMeth(): Unit =
    assertEquals("odd", parityMeth(3))

  @Test def testFalseStatement(): Unit =
    val notEmpty = neg(empty)
    assertFalse(notEmpty(""))

  @Test def testTrueStatement(): Unit =
    val notEmpty = neg(empty)
    assertTrue(notEmpty("fog"))
}
