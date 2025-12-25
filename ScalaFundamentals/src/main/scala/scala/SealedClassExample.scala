package scala

import scala.util.Random

@main
def sealedClassExample(): Unit = {
  var i =0 
  for ( i <- 1 to 10)
   val plt = getPlant()
    plt match
      case x:Fruit => println(s"Plant of type Fruit ${plt.getClass}")
      case x: Vegetable => println(s"Plant of type Vegetable  ${plt.getClass}")
}

sealed class Plant
sealed class Fruit extends Plant
sealed class Vegetable extends Plant
class Apple extends Fruit
class Methi extends Vegetable

def getPlant(): Plant = {
  if (Random.nextInt(100) %2 ==0)  return Apple() else return Methi()
}