package scala.practice

@main
def enumExample(): Unit = {
  println(Medal.GOLD.getPosition())
  for (medal <- Medal.values)
    println(s" $medal is at position  ${medal.getPosition()}  ")
  for (color <- COLOR.values)
    println(s" $color has a value of ${color.getColorName()}")
}

enum  Medal (position:Int):
  case GOLD extends Medal(position = 1)
  case SILVER extends Medal(position = 2)
  case BRONZE extends  Medal(position = 3)

  def getPosition():Int = return position
  def getMedal(position:Int):Medal = return getMedal(position)


enum COLOR (name:String):
  case RED extends COLOR("Red")
  case BLUE extends COLOR("Blue")
  case GREEN extends COLOR("Green")

  def getColorName():String = return name