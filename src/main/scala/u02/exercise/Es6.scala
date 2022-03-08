package u02.exercise

object Es6:
  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case n => fib(n - 2) + fib(n - 1)

  def fibTail(n: Int): Int =
    @annotation.tailrec
    def _fib(n: Int, acc2: Int, acc1: Int): Int = n match
      case 0 => acc2
      case 1 => acc1
      case n => _fib(n - 1, acc1, acc2 + acc1)

    _fib(n, 0, 1)
