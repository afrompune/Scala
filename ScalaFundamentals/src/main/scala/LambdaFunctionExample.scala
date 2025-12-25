import scala.collection.mutable.{ArrayBuffer, HashSet}
import scala.util.Random
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
 /* val retList = myFunc(List("Amandayyyy", "Lily", "Anna", "Bob"), (name:String)=> s"Hii $name")
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

  val uppCaseElts = retList.map(_.toUpperCase())
  println(uppCaseElts)

  val sorted = retList.sortBy(_.length)
  println(sorted)
  println("Sorted by default below")
  val sorted2 = retList.sortBy(_.trim)
  println(sorted2)
  println(retList.maxBy(_.length))
  println(retList.minBy(_.length))*/
  filterIntegers()
  sortByAlp()

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

def filterIntegers() = {
  //Generate Random Numbers
  val randNumbers = (1 to 20).map(_ => Random.nextInt(200))
  println(randNumbers)
  println(randNumbers.filter(_.toString.length == 2))  //filter using toString method
  println(randNumbers.filter(nb=> (nb>9 && nb<100))) // filter using values nb is each number in the list
  println(randNumbers.filter(10 until 100 contains _ )) // filter using range
}

def sortByAlp(): Unit = {
  val clients = List ("Amanda", "Lily","Bob","Mariaz","Sara","Sussane")
  println(clients.sortBy(client=> client(client.length-1)))
}


