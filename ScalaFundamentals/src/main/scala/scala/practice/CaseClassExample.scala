package scala.practice

import scala.collection.mutable.ArrayBuffer

@main
def caseClassExample(): Unit = {
  println("Trying out case classes")
  val customer1 = CustomerInfo("Mark","mark@gmail.com",List("Christmas Tree", "Cake"))
  val customer2 = CustomerInfo("Tony","tony@gmail.com",List("Wine", "Glasses"))
  val customer3 = CustomerInfo("Claire","claire@gmail.com",List("Bread", "Chips"))

  val customers = ArrayBuffer[CustomerInfo](customer1,customer2,customer3)
  sendEmailToCustomers(customers.toList)
  println("================ Making changes to cust list ================")
  // customers.addOne(customer2.copy(email = "tony_new@gmail.com"))
  customers(1)=customer2.copy(email = "tony_new@gmail.com")
  val customer4 = CustomerInfo("Mark","mark@gmail.com",List("Christmas Tree", "Cake"))
  //customers.addOne(customer4)
  sendEmailToCustomers(customers.toList)
}

def sendEmailToCustomers(custList :List[CustomerInfo]): Unit = {
  for (cust <- custList)
    cust.sendEmail()
}

case class CustomerInfo(name:String, email:String, productsBought:List[String]):
  def sendEmail(): Unit = {
    println(s"Sending Email to $name on email id $email")
  }
