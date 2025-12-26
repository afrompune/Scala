package scala.practice

@main
def functionPracticeExample (): Unit = {
  //Feeding Animals example
  val example = OverloadedMethodExample()
  val animals = List("cat","dog","rabbit","fox")
  example.feedAnimal(animals(0))
  example.feedAnimal(animals)
  //Calculation of prices example
  val productPricing = ProductPricing()
  println(productPricing.calculatePrice("Box",10))
  val products = Map[String,Double]("Pen"->2,"Pencil"->5,"Eraser"->2,"Glue"->4)
  println(f"Total Price of products ${productPricing.calculatePrice(products)}%.2f")
}

class OverloadedMethodExample :
  def feedAnimal(animal:String) = println(s"Feeding Animal $animal")
  def feedAnimal(animals:List[String]): Unit = {
    for (animal<-animals) feedAnimal(animal)
  }

class ProductPricing :
  def calculatePrice(productName:String, price:Double): Double = {
    val priceAfterTax = price + (price*.20)
    println(s"Price of $productName after tax is $$$priceAfterTax")
    priceAfterTax
  }
  def calculatePrice(productPrices: Map[String, Double]): Double = {
    var totalPrice = 0.0
    for ((key,value) <- productPrices)
      totalPrice += calculatePrice(key,value)
    totalPrice
  }
