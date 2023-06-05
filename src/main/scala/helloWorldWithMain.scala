object helloWorldWithMain {

  def main(args: Array[String]): Unit = {
    println("hello world")
    var a=15
    var b=25
    var c=add(a,b)
    println("addition of a and b is:"+c)
  }
  def add(i: Int, i1: Int) ={
    var i2=i+i1
    i2

  }
}
// not mandatory to specify return key word and return type
// if return key word is specified then mandatory to specify return type
