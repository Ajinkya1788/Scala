//Companion class has same name with object class and methods and variables can be called as shown below

class companionClassDemo {
  var x=5
  def getValue():Unit= {
    println(s"value of x is :${x} and value of y is :${companionClassDemo.y}")
  }

}
object companionClassDemo{
  var y= 2.2
  def main(args: Array[String]): Unit = {
  val objectDemoClassFromCompanion = new companionClassDemo
  println(s"value of x is ${objectDemoClassFromCompanion.x} and value of y is ${y}")
  objectDemoClassFromCompanion.getValue()
  }
}