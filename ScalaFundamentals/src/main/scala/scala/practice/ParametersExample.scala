package scala.practice

@main
def parametersExample(): Unit = {
  println(calculateSum(1,2,4,5,6))
  println(calculateSum(2,3))
  printMessage(2,"Tom", "Smith")

}

//Create a function that takes variable number of params and returns sum of those integers
def calculateSum(integers:Int*):Int = {
  var sum = 0
  for(i<-integers) sum += i
  sum
}

def printMessage(count:Int,clients:String*): Unit = {
  for(client<-clients)
    for (i<-1 to count)
      println(s"Hello $client")

}