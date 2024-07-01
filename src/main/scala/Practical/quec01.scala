package Practical

object quec01 {
  def main(args:Array[String]): Unit = {
    val word="Hello"
    println(reverse(word))
  }

  def reverse(str:String):String={
    if (str.isEmpty) ""
    else return str.reverse
  }

}
