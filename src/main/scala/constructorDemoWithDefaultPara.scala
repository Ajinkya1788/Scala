//constructor with default parameter

class demo1(var x:Int=15,var y:Double=58,z:String="Hello World") {
  val a=x
  val b=y
  val c=z
  def addNumb()={
    a+b
  }
  println(s"value of x is ${x} and value of y is ${y} ")

}

object constructorDemoWithDefaultPara {

  def main(args: Array[String]): Unit = {

    println("hello world!!!")
    var m = new demo1()
    println(m.addNumb())
    var n = new demo1(z="Hello World")    //in case of default parameter, we can provide the values but either in sequence or by specifing value is for which parameter
  }
}