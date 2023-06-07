//constructor with parameter

class demo(var x:Int,var y:Double,z:String) {
  val a=x
  val b=y
  val c=z
  def addNumb()={
  a+b
  }
  println(s"value of x is ${x} and value of y is ${y} ")

}

object constructorDemoWithClassPara {

  def main(args: Array[String]): Unit = {

    println("hello world!!!")
    var m = new demo(10, 23, "hello world")
    println(m.addNumb())
  }
}