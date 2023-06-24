object stringDemo {

  def main(args: Array[String]): Unit = {

    var greetings="hello world"  //String datatype is not defined. Auto interpreted
    var greetingsNew:String="hello world" //String data type is defined

  //Any method used to get information of object is called Accessor method
    //Method to get length of the string
    val lengthOfGreetings=greetings.length
     println(s"length of the string object greetings is ${lengthOfGreetings}")
    //Concat method is used to concatenate two strings
    var var1="hello"
    var var2="world"
    var var3=var1.concat(var2)  //we can concat two strings using '+' method as well
    println(var3)
    //Equals method to check equal string
    var var4=var1.equals(var2)
    println(var4)
    println(var1==var2) //works similar to equals
    //charAt is used to get character at given index
    println(var3.charAt(7))

  //String Formatting
    var nameOfCar="toyota"
    var costOfCar=50000
    var mileageOfCar=13.8

    printf("Name of the car is %s, cost of car is %d, mileage of car is %f",nameOfCar,costOfCar,mileageOfCar)

  //Multiline strings
    var multiLieStringA=
      """
        |Hello
        |World
        |!
        |!
        |!
        |""".stripMargin
    println(multiLieStringA) //pipe symbol with stripMargin removes the blank space
    var multiLieStringB=
      """
         Hello
         World
         !
         !
         !
         """
    println(multiLieStringB)
  //string interpolation
    //1. 's' string interpolator
    var name="modi"
    println("hello "+name)
    println(s"hello ${name}")
    println(s"hello $name")    //'s' interpolator is widely sued
    //2.
  }

}
