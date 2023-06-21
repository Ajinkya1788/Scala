object demoObject {
  var x = 55.2
  var y = 458

  def addvalue(): Double= {
  var z=x+y
  return z
  }
}

object singletonObject {
//we can not create object of object for eg. var b=new demoobject will not work. Therefore it is called singleton object.
  def main(args: Array[String]): Unit = {
    println("value of x is="+demoObject.x+",value of y is="+demoObject.y) //Access varible as objectName.variableName
    println("value of addition z is="+demoObject.addvalue)               // Access method as objectName.methodName
  }
}
