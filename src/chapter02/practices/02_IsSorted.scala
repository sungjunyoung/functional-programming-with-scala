object IsSorted {

  def isSorted[A](arr: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      val nextN = n + 1
      if (nextN >= arr.length) true
      else if (ordered(arr(n), arr(nextN))) loop(nextN)
      else false
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val stringArray: Array[String] = Array("a", "b", "c")
    println(isSorted(stringArray, (a: String, b: String) => if(a <= b) true else false))
    // true

    val intArray: Array[Int] = Array(1, 3, 2)
    println(isSorted(intArray, (a: Int, b: Int) => if(a <= b) true else false))
    // false
  }
}