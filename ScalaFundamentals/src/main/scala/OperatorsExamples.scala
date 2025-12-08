import scala.io.StdIn

@main
def operatorExample(): Unit = {
  println(2 + 5)
  println("aa" + "bb")
  println(4 - 2)
  println("7*3 = " + 7 * 3)
  println("5/2 =" + 5 / 2) // This will be integer
  println("5.0/2 =" + 5.0 / 2) // This will be double
  println("15%6 =" + 15 % 6)
  // Datatype of resultant == datatype of largest operand
  var a: Short = 4
  val b: Long = 11111
  println((a * b).getClass) // Long

  //Augmented assignments
  var c = 10
  c += 10
  println(c)
  c -= 5
  println(c)
  c *= 5
  println(c)
  c /= 2
  println(c)
  c %= 2
  println(c)
  // Problem :calculate 5.5% interest on an amount for 5 years
  println("Enter Amount ")
  val amount = StdIn.readInt()
  var interest = ((amount * 5.5) / 100) * 5
  println(s"Amount after 5 yearss = $$${amount + interest}")

  //Logical Operators
  println("Logical Operators ")
  println(true && true)
  println(true || false)
  println(!false)

  var x1 = 4.222 * 4666.55
  var x2 = 566.66 * 6.222
  println("x1 > x2? " + (x1 > x2))

}