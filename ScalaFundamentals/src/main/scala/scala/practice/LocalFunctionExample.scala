package scala.practice

import scala.io.StdIn

@main
def localFunctionExample(): Unit = {
  val userData = Map[String,Double]("Smith"->200,"John"->400, "Mary" ->20,"Elizabeth"->500)
  calculateBalance(userData)

  //Greeting Example
  var input ="test"
  while(!input.isEmpty) {
    println("Enter Name ")
    input = StdIn.readLine()
    if (input.isEmpty)
     println("Exiting")
    else
      greetUser(input)
  }

}

def calculateBalance (users: Map[String,Double]): Unit = {
  for(user <- users.keys) println(s"Balance for $user post calculation $$${doubleBalance(users(user))}")

  def doubleBalance(bal:Double) : Double = bal *2
}

def greetUser(user:String): Unit = {
  println(s"Hello $user, hope you are doing great")
}
