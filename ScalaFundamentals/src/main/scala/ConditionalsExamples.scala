import scala.util.Random

@main
def conditionalsExamples(): Unit = {
  //ifCondition()
  //rangeExamples()
  //matchcaseExamples()
  //forExamples()
  whileExamples()
}
def whileExamples(): Unit = {
  val totalPieces = 10
  var piecesUsed = 0
  while (piecesUsed <= totalPieces) {
    piecesUsed += 1
  }
  println(s"Total Pieces used is ${piecesUsed-1}")
}

def forExamples(): Unit = {
  val coll = List(1,2,3,4)
  for (i <- coll)
    println(i)

  for (row<- 1 to 3;  col<- 2 to 5 if (row>=2 && col<5))
    println(s"Row = $row , Col = $col")

  println()

  for (row <- 1 to 3; col <- 2 to 5 if row < 2; if col >= 5)
    println(s"Row = $row , Col = $col")

  val clients = List("Mary", "Bob", "Tom","Elizabeth", "Louis")
  val output = for (client <- clients if client.length>3)
    yield client  // In for loop - used to add element to output list
  println(output)

}
def matchcaseExamples(): Unit = {
  val number =100
  val mod = 4
  val modVal = number % mod
  val str = (modVal == 0) match
    case true => s"$number Divisible by $mod"
    case false => s"@number Not Divisible by $mod"
   println(str)
  val set = Set("deer","cat", "dog", "rat", "rabbit")
  val str1 = set.head match
    case "cat" | "dog" | "rabbit" => "starts with pet"
    case _ => "does not start with a  pet"
  println(str1)

  val item = "apple"
  val taste = "sour"
  item match
    case "apple" if taste == "sweet" => println(s"$item is $taste")
    case "mango" if taste == "sweet" => println(s"$item is $taste")
    case _ => println("fruit not considered")

  val number1 = Random.nextInt(25)
  number1 match
    case number1 if 1 until 10 contains number1=> println(s"Single Digit Number $number1")
    case y if 10 until 20 contains y => println(s"Double Digit number less than 20 -> $y")
    case _ => print(s"number greater than equal to 20 -> $number1")

}
def rangeExamples(): Unit = {
  var r1 = 1 to 10
  println(r1)
  println(r1.toList)
  println(r1.indexOf(18)) //-1 indicates element not there
  println(r1.indexOf(10)) //index starts with 0
  println(r1.length)
  val r3 = 1 until 10
  println(r3.toList)
  val r2 = 'a' to 'p'
  println(r2)
  println(r2.toList)
  //r2.foreach(println)
  val r4 = 0 to 100 by 4
  println(r4.toList)
  val r5 = Range.inclusive(0 , 20 ,4)
  println(r5.toList)

  // Reverse range
  val r6 = Range.inclusive(1,10,3).reverse
  println(r6.toList)
  val r7 = Range.inclusive(20, 1, -3).reverse
  println(r7.toList)
  println(r7.length)
  /*println(r7.step)
  println(r7.head )
  println(r7.tail.toList)
  println(r7.end)*/
  println(r7.indexOf(18))  //-1 indicates element not there
  println(r7.indexOf(20)) //index  starts with 0

}
def ifCondition(): Unit = {
  val boolValue = false
  if(boolValue)
    println("true")
    println("line2 in if")
    println("line 3 in if")
  println("not in if")

  val number =21
  val isEven = if(number %2 ==0) "even" else "odd"
  println(isEven)
}