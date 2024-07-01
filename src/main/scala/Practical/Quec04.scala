package Practical

object Quec04 {
  val myList:List[Int]=List(1,3,7,3,9,2,4,6);

  def main(args:Array[String]): Unit = {
    val Sum=findSum(myList)
    println(s"Sum of elements in myList: $Sum")
  }
  def findSum(num:List[Int]):Int={
    var Sum=0
    for(x<-num){
      Sum+=x
    }
  Sum

  }

}
