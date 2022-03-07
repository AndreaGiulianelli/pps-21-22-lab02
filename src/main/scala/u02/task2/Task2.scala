package u02.task2

/**
 * Used to wrap the code written in the REPL
 */
object Task2:
  // a
  val parity: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  def parityMeth(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  // b (also Tested)
  val neg: (String => Boolean) => (String => Boolean) = (f) => x => !(f(x))


