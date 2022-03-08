package u02

import org.junit.Test
import org.junit.Assert.assertEquals
import u02.exercise.Es6.{fib, fibTail}

class Es6Test {
  @Test def testFib(): Unit =
    assertEquals((0, 1, 1, 2, 3), (fib(0), fib(1), fib(2), fib(3), fib(4)))

  @Test def testFibTail(): Unit =
    assertEquals((0, 1, 1, 2, 3), (fibTail(0), fibTail(1), fibTail(2), fibTail(3), fibTail(4)))
}