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
// function is the reusable piece of code
// add is name of the function.i and i1 are arguments.
// It is mandatory to specify the datatype for arguments.
// It is not mandatory to specify return key word and return type.
// if return key word is specified then mandatory to specify return type.
//for example def add(i:Int, j:Int):Int{var k=i+j
//                                      return k}