import java.util.Calendar
import scala.io.StdIn

@main
  def inputFunc(): Unit = {
  println("Type your name ")
  val input = StdIn.readLine()
  println(s"Hi  : $input . Wish you a great day ahead."  )

  println("Type your birthyear ")
  val birthyear = StdIn.readInt()
  val cal = Calendar.getInstance()

  val currentYear =cal.get(Calendar.YEAR )
  println(s"Wish you happy   ${currentYear - birthyear}")
}
