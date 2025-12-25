package scala.practice

import scala.practice.ScalaCourse.getDefaultInfo

@main
def companionObjectExample(): Unit = {
  ScalaCourse.getDefaultInfo()
  println()
  val scalaCourse = ScalaCourse()
  scalaCourse.getScalaCourseInfo()

  //Lock Key Example
  val key1 = Lock.createKey(123)
  val key2 = Lock.createKey(234)
  val lock = Lock(Key(345))
  lock.openLock(key2)
  lock.openLock(key1)
}

class ScalaCourse:
  import ScalaCourse.*
  def getScalaCourseInfo() =
    getDefaultInfo()
    println("This is the Scala Course info")


object ScalaCourse:
  def getDefaultInfo()= println("This is the static info about scala course")

class Key(code:Int):
 def getCode():Int  = return code

class Lock (key:Key):
  var code = key.getCode()
  def getCode() :Int = return this.code
  def openLock(key: Key):Boolean=
    if(this.code==key.getCode())
      println(s"$code : ${key.getCode()}  Code Matched for lock and key. Opening Lock")
      return true
    else
      println(s"$code : ${key.getCode()} Code Did not matche for lock and key. Cannot open lock")
      return false

object Lock:
  def createKey(code:Int):Key =  return Key(code)
