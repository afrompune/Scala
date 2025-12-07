import scala.io.StdIn

@main
  def inputFunc(): Unit = {
  println("Type Something")
  val input = StdIn.readLine()
  println(s"Received Input : $input" )

  println("Type a Number ")
  val number = StdIn.readInt()
  println(s"Number + 2 = ${number + 2}")
}
