// Access level for Scala:
//          1. Public (By default)
//          2. Private (Can be accessed only in the class it is defined)
//          3. Protected (Can be accessed only in the class it s defined and extending to sub class
//Access level in Scala
// Public Variable : can be accessed anywhere(It is default type. No need to define)
// Private Variable: can be accessed only withing the class it is define( Define using key word private)
//Protected variable: can be accessed in the class it is defined and the subclass extending the given class
class Car {
  private var Showroomcost =45
  var Topextraamount=0
  var RoadTax=100
  var Insurance=25
  def cost(basiccost:Int):Int={
    var Totalcost=basiccost+Topextraamount+RoadTax+Insurance+Showroomcost
    return Totalcost
  }
  def CheckShowroomcost={
    Showroomcost
  }
}
// Class is collection of variables and methods
// Functions defined inside the class are called as methods
// object is nothing but instance of the class

object DemoClassObject {
  def main(args: Array[String]): Unit = {
    var BMW =new Car
    BMW.Insurance=35      //changes values only for BMW
    println("Road Tax will be:"+BMW.RoadTax)
    println("Insurance cost will be:"+BMW.Insurance)
//    println("Showroom cost will be:"+BMW.Showroomcost)  not accessible as it is private
//    to expose its value to user, we can create a function exposing its value. But user can't change its values
    println("Showroom cost will be"+BMW.CheckShowroomcost)
    println("Total cost will be:"+BMW.cost(455))

  }

}
