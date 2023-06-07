class demo2(var x:Int,var y:Double,var z:String){
  var a=x
  var b=y
  var c=z

  println(s"Primary Constructor Values are x=${a},y=${b} and z=${c}")

  def this(){
    this (12,25.3,"Hello")
    println("I am into auxilary constructor with 3 parameters")
  }
  def this(z:String){
    this (12,12.5,z)
    println("I am into auxilary constructor with 2 parameters")
  }
}


object ConstructorDemoWithAuxilary {

  def main(args: Array[String]): Unit = {
    var p=new demo2(10,10.5,"Hi")
    var q=new demo2(z="Hi")
    var r=new demo2()


  }

}
