package u02.exercise

object Es6:
  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case n => fib(n - 2) + fib(n - 1)
