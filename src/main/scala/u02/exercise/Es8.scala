package u02.exercise

object Es8:
  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:
    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match
      case Some(value) if f(value) => opt
      case _ => None()

    def map[A, B](opt: Option[A])(f: A => B): Option[B] = opt match
      case Some(value) => Some(f(value))
      case _ => None()

    // f return an Option in order to permit to return None() to a composition
    def map2[A, B, C](opt1: Option[A])(opt2: Option[B])(f: (A, B) => Option[C]): Option[C] = (opt1, opt2) match
      case (Some(value1), Some(value2)) => f(value1, value2)
      case _ => None()