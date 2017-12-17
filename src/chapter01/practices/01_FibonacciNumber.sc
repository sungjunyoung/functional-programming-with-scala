def factorial(n: Int): Int = {
  def go(prevPrev: Int,
         prev: Int,
         goal: Int,
         count: Int): Int = {
    if (goal == 1 || goal == 2) {
      return 1
    }

    val next = prevPrev + prev
    val nextCount = count + 1

    if (nextCount == goal) {
      return next
    }

    println(next)
    go(prev, next, goal, nextCount)
  }

  go(1, 1, n, 2)
}

factorial(10)