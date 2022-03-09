package u02.exercise

object Es9:
  enum Tree[A]:
    case Leaf(value: A)
    case Branch(left: Tree[A], right: Tree[A])

  object Tree:
    def traverse[A, B](t: Tree[A], union: (B, B) => B, base: A => B): B = t match
      case Branch(l, r) => union(traverse(l, union, base), traverse(r, union, base))
      case Leaf(e) => base(e)

