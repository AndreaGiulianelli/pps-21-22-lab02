package u02

import org.junit.Test
import org.junit.Assert.assertEquals
import u02.exercise.Es6.fib

class Es6Test {
  @Test def testFib(): Unit =
    assertEquals((0, 1, 1, 2, 3), (fib(0), fib(1), fib(2), fib(3), fib(4)))
}