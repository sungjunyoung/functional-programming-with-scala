def compose[A, B, C](f: B => C, g: A => B): A => C =
  (a: A) => f(g(a))

// compose 가 일상적으로 쓰이기 때문에 표준 라이브러리에서 compose 제공

val f = (x: Double) => math.Pi / 2 - x
val cos = f andThen math.sin