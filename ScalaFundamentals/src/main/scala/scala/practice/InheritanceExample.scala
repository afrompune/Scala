package scala.practice

@main
def inheritanceExample(): Unit = {
  val laptop = Laptop()
  laptop.describe()
  val apple =  new Apple()
  apple.describe()

  val box = Box()
  println(box.contents)
  box.updateContents("New Box Content")
  println(box.contents)
}

class Laptop:
  var screensize = 21
  var speed =100
  def describe() = println(s"Laptop has speed $speed and dimension $screensize")

class Apple extends  Laptop:
  screensize=15

class Box :
  var contents :String = "Original Box Content"
  def updateContents (contents:String): Unit = {
    this.contents=contents
  }
