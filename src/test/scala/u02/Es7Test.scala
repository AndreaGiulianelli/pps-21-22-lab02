package u02

import org.junit.Test
import org.junit.Assert.assertEquals
import u02.exercise.Es7.Shape
import u02.exercise.Es7.Shape.{Rectangle, Square, Circle, area, perimeter}

class Es7Test {
  @Test def testRectanglePerimeter(): Unit =
    assertEquals(30, perimeter(Rectangle(10,5)), 10e-10)

  @Test def testRectangleArea(): Unit =
    assertEquals(50, area(Rectangle(10,5)), 10e-10)

  @Test def testSquarePerimeter(): Unit =
    assertEquals(40, perimeter(Square(10)), 10e-10)

  @Test def testSquareArea(): Unit =
    assertEquals(100, area(Square(10)), 10e-10)

  @Test def testCirclePerimeter(): Unit =
    assertEquals(25.12, perimeter(Circle(4)), 10e-10)

  @Test def testCircleArea(): Unit =
    assertEquals(50.24, area(Circle(4)), 10e-10)

}
