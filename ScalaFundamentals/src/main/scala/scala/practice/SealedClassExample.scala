package scala.practice

import scala.util.Random

@main
def sealedClassExample(): Unit = {
  val vehicle = getVehicle()
  // val r = Car()
  print(vehicle.getClass)
  vehicle match {
    case x : Car => println("  Not good for health")
    case x : Bicycle => println("  Good for health")
  }

}

sealed class Vehicle

sealed class Bicycle extends  Vehicle
sealed class Car extends  Vehicle


def getVehicle():Vehicle = {
  if(Random.nextInt(20)%2 ==0) return Car()
  else return Bicycle()

}