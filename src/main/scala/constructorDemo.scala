//constructor without parameter

class democlass{
  val x=15
  val y=20
  println(s"value of x is ${x} and value of y is ${y}")
  def add:Int={
    val z=x+y
    return z
  }
}


object constructorDemo {

  def main(args: Array[String]): Unit = {
    println("Hello World!!!")
    var a=new democlass
    println(a.add)
  }

}
