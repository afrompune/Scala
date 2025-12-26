open class MyFirstScalaClass :
 var carBrand = "Toyota"
 var speedOfCar = 100
 var wheels = Wheels()
 def startCar() = println(s"Starting car $carBrand")
 def driveCar (speed:Int) = println(s"Starting to drive at a speed of $speed")

@main
def classExample(): Unit = {
  val myclass = MyFirstScalaClass()
  myclass.carBrand="BMW"
  myclass.startCar()
  myclass.driveCar(20)
  myclass.wheels.rotateWheel()

  println("==== Further Operations with inheritance ======")
  var newClass = NewClass()
  newClass.testInheritance()
  newClass.startCar()
  newClass.driveCar(60)
}

open class Wheels :
  val noOfWheels = 4
  def rotateWheel () = println("Rotate Wheel ")

class NewClass extends MyFirstScalaClass:
  def testInheritance() = println("here")
  