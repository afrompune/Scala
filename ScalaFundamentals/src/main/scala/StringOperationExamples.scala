// Scala3
/*
@main
def hello() =print("Hello World from Preeti")
*/

@main
def strings(): Unit = {
  val catName = "my Cat's name is \"Fluffy\"  "
  println(catName)
  println("(\\(\\")
  println("(-.-)")
  println("0_(\")(\")")
  println(catName.length)
  println(catName.capitalize)
  println(catName.toLowerCase)
  println(catName.toUpperCase())
  println(catName(4))
  println(catName.charAt(24))
  println(catName.substring(3, 13))
  println(catName.trim.length)
  val numberOfLegs = 4
  println(s"$catName . Number of legs = $numberOfLegs. It has ${1 + 1} ears")
  println(raw"This is \\\ raw interpolator")
  //println(f"This is float interpolator ${5/2%.2f}")
  val multiLineStr =
    """This is a
      |multiline
      |string""".stripMargin
  println(multiLineStr)
}