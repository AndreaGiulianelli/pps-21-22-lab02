package u02

import org.junit.Test
import org.junit.Assert.assertEquals
import u02.exercise.Es8.Option.{Some, None, filter, map, map2}

class Es8Test {

  @Test def testFilterTrue(): Unit =
    assertEquals(Some(5), filter(Some(5))(_ > 2))

  @Test def testFilterFalse(): Unit =
    assertEquals(None(), filter(Some(5))(_ > 10))

  @Test def testFilterWithNone(): Unit =
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap(): Unit =
    assertEquals(Some("odd"), map(Some(5))({case n if n % 2 == 0 => "even"; case _ => "odd"}))

  @Test def testMapWithNone(): Unit =
    assertEquals(None(), map(None[Int]())({case n if n % 2 == 0 => "even"; case _ => "odd"}))

  @Test def testMap2(): Unit =
    assertEquals(Some(10), map2(Some(6))(Some(4))((x, y) => Some(x + y)))

  @Test def testMap2DifferentTypes(): Unit =
    assertEquals(Some("Scala3"), map2(Some("Scala"))(Some(3))((x, y) => Some(x + y)))

  @Test def testMap2WithNone(): Unit =
    assertEquals(None(), map2(Some(6))(None())((x, y) => Some(x)))
}
