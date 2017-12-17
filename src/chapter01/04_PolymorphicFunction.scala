object PolymorphicFunction {

  //  def fintFirst(ss: Array[String], key: String): Int = {
  //    @annotation.tailrec
  //    def loop(n: Int): Int =
  //      if (n >= ss.length) -1
  //      else if (ss(n) == key) n
  //      else loop(n + 1)
  //
  //    loop(0)
  //  }

  // 함수단에서 타입을 인수로 받는다.
  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val stringArray: Array[String] = Array("hello", "hi", "junyoung")
//    println(fintFirst(stringArray, "hi"))
    println(findFirst(stringArray, (s: String) => s == "hi"))
  }
}