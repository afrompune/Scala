package scala.practice

@main
def nestedClassExample(): Unit = {
  val airplane = Airplane1()
  airplane.takeOff()
}

class Airplane1:
  val engineLeft = Engine("Left")
  val engineRight = Engine("Right")
  def takeOff():Unit = {
    engineRight.startEngine()
    engineLeft.startEngine()
    println("Ready to take off")
  }

  class Engine(name:String):
    def startEngine() = println(s"Starting Engine $name")