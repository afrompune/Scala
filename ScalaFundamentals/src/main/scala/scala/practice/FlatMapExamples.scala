package scala.practice

@main
def flatMapExamples(): Unit = {
  val names = List ("Mark", "Tony", "Maria" , "Alicia")
  println(names)

  println(s"Map : ${names.map(_.toLowerCase())} " )
  println(s"FlatMap : ${names.flatMap(_.toLowerCase())}")
  println(s"Flatten : ${names.flatten(_.toLowerCase())}" )

  val clientInfo = Map (1-> ClientInfo1("Mark", "m@a.com"), 2-> ClientInfo1("Tony", "t@a.com"), 3-> ClientInfo1("Maria", "m@a.com"), 4-> ClientInfo1("Alicia", "a@a.com"))
  println(clientInfo)
  println(clientInfo.flatMap(_.toList).map(_.toString).flatMap(_.toLowerCase()))
  //println(clientInfo.flatMap()
  println(clientInfo.map(_._1 * 2))
  // println(clientInfo.map(_._2).map(_.name.toUpperCase()))
  //println(clientInfo.map(_.toList).filter(_.getClass().eq(ClientInfo1)))
  
  println(clientInfo.mapValues(x => "hi" + x))
}

case class ClientInfo1 (name:String,email:String)