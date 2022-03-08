package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.exercise.Es3.{parity, parityMeth, neg, negMeth, negGeneric}

/**
 * I will test also the vals, even if it's not properly correct.
 * Vals are more a private thing and usually are tested only the methods.
 */
class Es3Test {
  val empty: String => Boolean = _ == ""
  val odd: Int => Boolean = _ % 2 == 0

  @Test def testParityEvenVal(): Unit =
    assertEquals("even", parity(2))

  @Test def testParityOddVal(): Unit =
    assertEquals("odd", parity(3))

  @Test def testParityEvenMeth(): Unit =
    assertEquals("even", parityMeth(2))

  @Test def testParityOddMeth(): Unit =
    assertEquals("odd", parityMeth(3))

  @Test def testNegFalseStatement(): Unit =
    val notEmpty = neg(empty) // Verbose, for educational purpose
    assertFalse(notEmpty(""))

  @Test def testNegTrueStatement(): Unit =
    val notEmpty = neg(empty) // Verbose, for educational purpose
    assertTrue(notEmpty("fog"))

  @Test def testNegMethFalseStatement(): Unit =
    val notEmpty = negMeth(empty) // Verbose, for educational purpose
    assertFalse(notEmpty(""))

  @Test def testNegMethTrueStatement(): Unit =
    val notEmpty = negMeth(empty) // Verbose, for educational purpose
    assertTrue(notEmpty("fog"))

  @Test def testGenericNegTrueStatementWithInt(): Unit =
    assertTrue(negGeneric(odd)(3))

  @Test def testGenericNegFalseStatementWithInt(): Unit =
    assertFalse(negGeneric(odd)(2))

  @Test def testGenericNegTrueStatementWithString(): Unit =
    assertTrue(negGeneric(empty)("fog"))

  @Test def testGenericNegFalseStatementWithString(): Unit =
    assertFalse(negGeneric(empty)(""))

}
