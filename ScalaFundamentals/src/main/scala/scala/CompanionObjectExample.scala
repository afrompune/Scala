package scala

@main
def companionClassExample(): Unit = {
  val plane = Airplane()
  plane.goUp()
  plane.goDown()
  plane.goDown()
  plane.goDown()
  println()

}

class Airplane :
  import Airplane.*
  val brand = "Jet"
  var altitude = 2000
  def goUp()= {
    altitude += 1000
    println(s"Airplane of brand $brand  up at $altitude")
  }
  def goDown(): Unit = {
   if(canGoDown(altitude))
     altitude -= 1000
     println(s"Airplane of brand $brand  down at $altitude")
   else
     println(s"Airplane cannot go down")
  }

  object Airplane:
    def canGoDown(altitude:Int) : Boolean =
      if (altitude > 1000)
        println("Going down approved")
        return true
      else {
        println("Permission denied for going down")
        return false
      }

