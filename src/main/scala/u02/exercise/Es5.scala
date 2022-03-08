package u02.exercise

object Es5:
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
  
  def composeGeneric[A, B, C, D <: A](f: A => B, g: C => D): C => B = x => f(g(x))

