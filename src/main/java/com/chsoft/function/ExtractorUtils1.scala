package com.chsoft.function

/**
  * Created by zhuhuihui on 16/12/11.
  */

case class Person1(name:String,age:Int)

class DTCoder(val name:String,val salary:Int)

object DTCoder{

  def apply(name:String,salary:Int)={
    println("DTCoder apply invoke")
     new DTCoder(name,salary)
  }

  def unapply(info:DTCoder)={
    Some((info.name,info.salary))
  }
}

object ExtractorUtils1 extends  App{

  var person = Person1.apply("spark",2000)
  val Person1(name,age) = person
  println(name+ "  " + age)



  val dtcoder = DTCoder("hadoop",2000)
  val DTCoder(name1,salary) = dtcoder
  //println(name+ "  " + age)

  //val DTCoder(names) = "hadoop_spark 3000"

}
