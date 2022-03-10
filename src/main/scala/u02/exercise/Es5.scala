package u02.exercise

object Es5:
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
  
  def composeGeneric[A, B, C](f: A => B, g: C => A): C => B = x => f(g(x))

