package scala.practice

import scala.util.Random

@main
def lambdaPracticeExample(): Unit = {
  var numbers =  Array[Int](20,330,234, 13, 453,350)
  println(numbers.toList)
  numbers = higherOrderFunction(numbers, (number:Int) => number/10 )
  println(numbers.toList)

  //String Eg
  val clients = List("Mr.Nathan", "Mrs. Alexa","Ms Lily","Mr.Tony")
  applyLambda(clients,(client:String)=>client.toUpperCase())

  //Print subset of integers that are >25
  val randNumbers = (1 to 20).map(_ => Random.nextInt(100))
  println(randNumbers)
  val subset = randNumbers.map{n =>
    if(n%2==0)
      n/2
    else
      n
  }.filter(_ > 25)
  println(subset.toList)
  println(numbers.toList)
  println(numbers.filter(_>20).toList)

}

def higherOrderFunction(numbers:Array[Int], lbdFn:Int=>Int) : Array[Int] = {
 for (i <- numbers.indices)
   if(numbers(i) %2 == 0)
    numbers(i) = lbdFn(numbers(i))
 numbers
}

def applyLambda(clients:List[String],lambdaFn:String=>String):Unit={
  for (client <- clients)
    if (client.startsWith("Mr."))
      println(lambdaFn(client))
    else
      println(client)
}

//def processNumbers(numbers:List[Int],process:Int=>Int)