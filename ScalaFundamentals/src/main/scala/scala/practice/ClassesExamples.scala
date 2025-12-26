package scala.practice

class Animal {
  var topSpeed = 100

  def run(): Unit = println(s"Animal running at speed $topSpeed")
}



class SimpleMath :
  def add(num1:Int,num2:Int) = num1+num2
  def sub(num1:Int,num2:Int) = num1-num2
  def mult(num1:Int,num2:Int) = num1*num2
  def div(num1:Int,num2:Int) = num1/num2

class BankAccount:
  private var amount = 0
  private var creditRating =0
  private var interestRate =0.0
  def addAmount(amount:Int): Unit = {
    this.amount += amount
    this.creditRating +=1
  }
  def removeAmount(amount:Int): Unit = {
    this.amount -= amount
    this.creditRating -= 1
  }
  def getCreditRating(): Int = {
    return creditRating
  }
  def calculateInterestRate(): Unit = {
    println(s"Amount = $amount")
    amount match {
      case x if (amount <= 1000) =>
        this.interestRate = 1
        println("Setting Interest Rate to 1")
      case x if (amount <10000) =>
        this.interestRate=0.5
        println("Setting Interest Rate to 0.5")
      case x if(amount > 10000)  =>
        this.interestRate = 0.2
        println("Setting Interest Rate to 0.2 ")
      case _ => this.interestRate=0
    }
  }
  def getInterestRate():Double = {
    return this.interestRate
  }
  def getAmount() : Int = return  amount




@main
def mainFn (): Unit = {
  val animal = Animal()
  animal.run()
  animal.topSpeed = 200
  animal.run()
  val math = SimpleMath()
  println(math.add(20,3))
  println(math.sub(20,3))
  println(math.mult(20,3))
  println(math.div(20,3))
  val bnkAcc =  BankAccount()
  for (i<-1 to 10)
    bnkAcc.addAmount(100)
  println(s"CreditRating = ${bnkAcc.getCreditRating()}")
  bnkAcc.calculateInterestRate()
  println(s"Balance =${bnkAcc.getAmount()}  InterestRate = ${bnkAcc.getInterestRate()}")
  for (i <- 1 to 5)
    bnkAcc.removeAmount(50)
  println(s"CreditRating = ${bnkAcc.getCreditRating()}")
  bnkAcc.calculateInterestRate()
  println(s"Balance =${bnkAcc.getAmount()} InterestRate = ${bnkAcc.getInterestRate()}")
}