package u02.exercise

object Es7:
  enum Shape:
    case Rectangle(lenght: Double, width: Double)
    case Square(side: Double)
    case Circle(radius: Double)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Rectangle(l: Double, w: Double) => 2 * l + 2 * w
      case Square(s: Double) => s * 4
      case Circle(r: Double) => 2 * 3.14 * r

    def area(shape: Shape): Double = shape match
      case Rectangle(l: Double, w: Double) => l * w
      case Square(s: Double) => s * s
      case Circle(r: Double) => 3.14 * r * r