package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.exercise.Es3.parity
import u02.exercise.Es5.{compose, composeGeneric}

class Es5Test {
  enum Person:
    case Student(name: String, mat: String)
    case Teacher(name: String, surname: String)

  @Test def testCompose(): Unit =
    assertEquals(9, compose(_ - 1, _ * 2)(5))

  @Test def testGenericCompose(): Unit =
    val getName = (x: Person) => x match
      case Person.Student(name, mat) => name
      case Person.Teacher(name, surname) => name

    // Testing also the type bound
    assertEquals("Andrea", composeGeneric(getName, (name: String) => Person.Student(name, name + 1))("Andrea"))

}
