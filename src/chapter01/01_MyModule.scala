// 단일체 객체의 선언, 클래스와 클래스의 유일한 인스턴스를 동시에 선언
object MyModule {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  // Unit == void
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }
}