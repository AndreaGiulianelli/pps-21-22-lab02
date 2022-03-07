package u02

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test
import u02.task2.Task2B.{p1, p2, p3, p4}

/**
 * I will test also the vals, even if it's not properly correct.
 * Vals are more a private thing and usually are tested only the methods.
 */
class Task2BTest {
  @Test def testCurryingValTrue(): Unit =
    // Verbose for educational purpose
    // It can be done in single line p1(6)(8)(10)
    val lessX = p1(6)
    val lessXY = lessX(8)
    val lessXYZ = lessXY(10)
    assertTrue(lessXYZ)

  @Test def testCurryingValFalse(): Unit =
    assertFalse(p1(10)(11)(9))

  @Test def testNonCurryingValTrue(): Unit =
    assertTrue(p2(9, 10, 11))

  @Test def testNonCurryingValFalse(): Unit =
    assertFalse(p2(9, 10, 8))

  @Test def testCurryingMethTrue(): Unit =
    assertTrue(p3(10)(11)(12))

  @Test def testCurryingMethFalse(): Unit =
    assertFalse(p3(10)(11)(9))

  @Test def testNonCurryingMethTrue(): Unit =
    assertTrue(p4(9, 10, 11))

  @Test def testNonCurryingMethFalse(): Unit =
    assertFalse(p4(9, 10, 8))
}
