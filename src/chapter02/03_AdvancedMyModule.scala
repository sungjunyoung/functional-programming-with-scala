// 단일체 객체의 선언, 클래스와 클래스의 유일한 인스턴스를 동시에 선언
object AdvancedMyModule {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  //  private def formatAbs(x: Int) = {
  //    val msg = "The absolute value of %d is %d"
  //    msg.format(x, abs(x))
  //  }
  //
  //  private def formatFactorial(n: Int) = {
  //    val msg = "The factorial of %d is %d."
  //    msg.format(n, factorial(n))
  //  }

  // f: 함수를 인자로 전달
  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }


  // Unit == void
  def main(args: Array[String]): Unit = {
    //    println(formatAbs(-42))
    //    println(formatFactorial(7))

    println(formatResult("absolute value", -42, abs))
    println(formatResult("factorial", 7, factorial))
  }
}