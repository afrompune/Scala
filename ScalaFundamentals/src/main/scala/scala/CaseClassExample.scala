package scala
@main
def caseClassExample(): Unit = {
  val user1 = User("Tim", "timhortons@gmail.com","12345")
  println(user1)
  println(user1.toString)
  val user2 = User("Tim", "timhortons@gmail.com","12345")
  println(user2==user1)
  val user3 = User("Alex", "alexhortons@gmail.com","1235")
  println(user3==user1)
  val user4 = user1.copy(password = "2222")
  println(user1)
  println(user4)
  println(user4==user1)
  var user5 = user2
  println(user5==user2)
  user5 = user3
  println(user5 == user2)
  println(user3._2)
  println(user4._3)
}


case class User (user:String, email:String, password:String)