package scala

@main
def enumExample = {
  val enum1 = Color
  val red = Color.RED
  val redValue = red.hexCode
  println(s" Enum ${enum1.RED} hex code is $redValue")
}

enum Color (val hexCode : String) :
  case RED extends Color("0xff0000")
  case BLUE extends Color("0x00ff00")
  case GREEN extends Color("0x0000ff")
