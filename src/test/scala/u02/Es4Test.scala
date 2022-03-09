package u02

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test
import u02.exercise.Es4.{p1, p2, p3, p4}

/**
 * I will test also the vals, even if it's not properly correct.
 * Vals are more a private thing and usually are tested only the methods.
 */
class Es4Test {
  val first = 6
  val second = 8
  val third = 10

  @Test def testCurryingValTrue(): Unit =
    // Verbose for educational purpose
    // It can be done in single line p1(6)(8)(10)
    val lessX = p1(first)
    val lessXY = lessX(second)
    val lessXYZ = lessXY(third)
    assertTrue(lessXYZ)

  @Test def testCurryingValFalse(): Unit =
    assertFalse(p1(second)(third)(first))

  @Test def testNonCurryingValTrue(): Unit =
    assertTrue(p2(first, second, third))

  @Test def testNonCurryingValFalse(): Unit =
    assertFalse(p2(first, third, second))

  @Test def testCurryingMethTrue(): Unit =
    assertTrue(p3(first)(second)(third))

  @Test def testCurryingMethFalse(): Unit =
    assertFalse(p3(third)(second)(first))

  @Test def testNonCurryingMethTrue(): Unit =
    assertTrue(p4(first, second, second))

  @Test def testNonCurryingMethFalse(): Unit =
    assertFalse(p4(first, third, second))
}
