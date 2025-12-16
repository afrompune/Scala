import scala.collection.mutable.{ArrayBuffer, HashSet}
@main
def lambdaExample(): Unit = {
  println("In Main")
 /* val lambdaFn = (name:String) => {
    println(s"In lambda function with variable $name")
    println("next line")
  }*/
  //sayHello(List("str1","str2","str3"),lambdaFn)
  //sayHello(List("a","b"), (name:String)=>println(s"Inline lambda with param $name"))
  //val fn = (i:Int)  =>  i/10
  //highOrderFn(HashSet(1,3,11,2,50,2,20,30), fn)
  val retList = myFunc(List("Amandayyyy", "Lily", "Anna", "Bob"), (name:String)=> s"Hii $name")
  println(retList)

  retList.foreach{ retVal =>
    println(s"client name : ${retVal.toUpperCase()}")
  }
  println("===========")
  retList.filter(_.contains("an")).foreach(println)
  println("===========")
  retList.filter(_.length <=10) .foreach(println)

  val sizes = retList.map(_.length)
  println(sizes)

  val sorted = retList.sortBy(_.length)
  println(sorted)

  println(retList.maxBy(_.length))
  println(retList.minBy(_.length))

}
def highOrderFn (set:HashSet[Int], function:Int=> Int): Unit = {
  for (s <- set)
    if(s%2==0) println(function(s))
}
def sayHello (strs:List[String], doSomething : String => Unit): Unit = {
  println("In SayHello")
  for (s <- strs) doSomething(s)
}

def myFunc(clients : List[String], messageGenerator:String=>String) : List[String] = {
  val a = ArrayBuffer[String]()
  for(c<-clients)
    a.addOne(messageGenerator(c))
  a.toList
}

