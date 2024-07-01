package Practical

object Quec02 {
  val myList: List[String] = List("Supun", "Raju","John","Nisam","Ronesh","Kushan","Piyumika");

  def main(args:Array[String]): Unit = {
    count(myList)
  }

  def count(str:List[String]): Unit = {
    for(x<-str){
      if (x.length >5) println(x)
    }
  }
}
