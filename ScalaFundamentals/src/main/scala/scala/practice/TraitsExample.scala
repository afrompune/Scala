package scala.practice

@main
def TraitsExample(): Unit = {
  val localRestaurant = LocalRestaurant()
  localRestaurant.getFood()
  localRestaurant.payBill()

  val fancyRestaurant = FancyRestaurant()
  fancyRestaurant.getFood()
  fancyRestaurant.payBill()
}

trait Restaurant:
  def payBill() = println("Paying Bill at Restaurant")
  def getFood() = println(("Getting Food at Restaurant"))

class LocalRestaurant extends  Restaurant:
  override def getFood(): Unit = println("Eating at Local Restaurant")

class FancyRestaurant extends  Restaurant:
  override def payBill(): Unit = println("Paying at Fancy Restaurant ")
