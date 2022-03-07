package u02.task2

/**
 * Used to wrap the code written in the REPL
 */
object Task2A:
  // a
  val parity: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  def parityMeth(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  // b
  val neg: (String => Boolean) => (String => Boolean) = f => x => !(f(x))
  def negMeth(f: String => Boolean): (String => Boolean) = x => !(f(x))

  //c
  def negGeneric[T]: (T => Boolean) => (T => Boolean) = f => x => !(f(x))


