package scala

class ConstructorExample(str:String):
  println(s"Constr $str")

  def this(str:String, i:Int)=
    this(str)
    println("In other constructor")


@main
def funcMain(): Unit = {
  val c1 = ConstructorExample("as")
  val c2 = ConstructorExample("c2",10)
}

