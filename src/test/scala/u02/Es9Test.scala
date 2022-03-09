package u02

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import u02.exercise.Es9.Tree.*

class Es9Test {
  val tree = Branch(Branch(Leaf(2), Leaf(2)), Leaf(1))

  @Test def testTraverseSize(): Unit =
    assertEquals(3, traverse(tree, (x: Int, y: Int) => x + y, (x) => 1))

  @Test def testTraverseFindTrue(): Unit =
    assertTrue(traverse(tree, (x: Boolean, y: Boolean) => x || y, (x) => x == 1))

  @Test def testTraverseFindFalse(): Unit =
    assertFalse(traverse(tree, (x: Boolean, y: Boolean) => x || y, (x) => x == 4))

  @Test def testTraverseCount(): Unit =
    assertEquals(2, traverse(tree, (x: Int, y: Int) => x + y, {case 2 => 1; case _ => 0}))

  @Test def testTraverseCountElementNotPresent(): Unit =
    assertEquals(0, traverse(tree, (x: Int, y: Int) => x + y, {case 3 => 1; case _ => 0}))
}
