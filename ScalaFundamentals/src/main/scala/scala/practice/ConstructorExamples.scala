package scala.practice

@main
def constructorExamples(): Unit = {
  val table1 = Table()
  table1.describe()

  val table2 = Table(2,20)
  table2.describe()

  val table3 = Table(21)
  table3.describe()

  //TShirt Example
  val user1 = OnlineStoreUser()
  val user2 = OnlineStoreUser("Preeti",100)
  val user3 = OnlineStoreUser("Tony")
  val user4 = OnlineStoreUser(200)


}

class Table (legs:Int, height:Int):
  def this() = this(4,40)
  def this(height:Int)= this(3,height)
  def describe() = println(s"Table with height $height inches has $legs legs")


class OnlineStoreUser (userName:String, balance:Int) {
  val tShirtPrice = 20
  println(s"User $userName can afford ${balance/tShirtPrice} Tshirts of price $tShirtPrice")

  def this(userName: String) = this(userName, 50)

  def this(balance: Int) = this("DefaultUser", balance)

  def this() = this("DefaultUser", 50)
}



  /*def canAffordTShirt () = balance>=tShirtPrice
  def howManyTshirts() = balance/tShirtPrice*/