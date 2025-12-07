import scala.io.StdIn
@main
def numberExample(): Unit = {
  // Basic Number handling - multiplication example
  val price = 12
  val numberOfItems =  23
  val sampleDecimalNo = 23.6
  val sampleLongNo = 2200000088888L
  val sampleFloatNo = 34444.3222f
  val largeNumber = 100_000_88
  println (s"Total amount to be paid for $numberOfItems items each priced at $price is ${numberOfItems*price}")

  // Types of Integers : Byte(8 bit), Short(16 bit), Int(32 bit, default assigned by compiler), Long(64 bit). Byte and Short not very frequently used
  // Types of Floats : Float (32 bit, 6-7 decimals), Double (64 bits, default one assigned by compiler )
  println("Default Type of number is " + numberOfItems.getClass)
  println("Default Type of decimal is " + sampleDecimalNo.getClass)
  println(s"DataType of $sampleLongNo " + sampleLongNo.getClass)
  println(s"DataType of $sampleFloatNo " + sampleFloatNo.getClass)
  println(s"The Large Number is $largeNumber with datatype "+ largeNumber.getClass)

  // Example exercise : Read Input from User, Multiply by Double Variable and check datatype of result
  println("Enter a whole number : ")
  val input = StdIn.readLine()
  val intInput = input.trim.toInt
  val multiplyWithDouble  = intInput * sampleDecimalNo
  println (s"Datatype of $intInput multiplied with $sampleDecimalNo is " + multiplyWithDouble.getClass)

  val sampleByte : Byte = 5
  println (s"Validating data Type of $sampleByte is "+ sampleByte.getClass)
  val convertDType = sampleByte.toLong
  println(s"Validating datatype conversion to" + convertDType.getClass + " from "+ sampleByte.getClass)
  println("Checking conversion Long to Int " + sampleLongNo.toInt) // notice data lost/incorrect data
  println("Conversion to String " + numberOfItems.toString.getClass)

  val pi = 3.14
  println("Int value of pi " + pi.toInt) // Will remove all after decimals - irrespective of what numbers it has.
}