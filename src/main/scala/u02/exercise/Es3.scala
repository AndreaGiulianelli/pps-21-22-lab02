package u02.exercise

object Es3:
  val parity: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  def parityMeth(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  val neg: (String => Boolean) => (String => Boolean) = f => x => !(f(x))

  def negMeth(f: String => Boolean): (String => Boolean) = x => !(f(x))

  def negGeneric[T](f: T => Boolean): (T => Boolean) = x => !(f(x))
