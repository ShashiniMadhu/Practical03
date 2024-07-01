package Practical

object Quec03 {
  def main(args:Array[String]): Unit ={
    val num1 = 20
    val num2 = 1
    val mean = findMean(num1, num2)
    println(mean)
  }

  def findMean(num1: Int, num2: Int) = {
    val mean = (num1 + num2) / 2.0
    f"$mean%.2f"
  }
}
