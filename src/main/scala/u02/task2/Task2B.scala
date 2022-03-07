package u02.task2

object Task2B:
  val p1: Double => Double => Double => Boolean = x => y => z => x <= y && y <= z
  val p2: (Double, Double, Double) => Boolean = (x, y, z) => x <= y && y <= z
  def p3(x: Double)(y: Double)(z: Double) = x <= y && y <= z
  def p4(x: Double, y: Double, z: Double) = x <= y && y <= z
