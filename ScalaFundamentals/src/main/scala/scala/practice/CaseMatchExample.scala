package scala.practice

import scala.io.StdIn

@main
def caseMatchExample(): Unit = {
  println("Please enter animal name ")
  val animal = StdIn.readLine()
  println(s"Lifespan of $animal is  ${calculateLifeSpan(animal)}")
}

//input a cat and return its life span
def calculateLifeSpan(animal:String) :Int = {
  val lifespan = animal match {
    case "cat" => 15
    case "dog" => 10
    case "rabbit" => 12
    case _  => 20
  }
  return lifespan
}
