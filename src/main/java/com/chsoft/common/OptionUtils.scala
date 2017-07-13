package com.chsoft.common

object OptionUtils {
  
  def main(args: Array[String]): Unit = {
    
    //虽然 Scala 可以不定义变量的类型，不过为了清楚些，我还是把他显示的定义上了
     val myMap: Map[String, String] = Map("key1" -> "value")
     val value1: Option[String] = myMap.get("key1")
     val value2: Option[String] = myMap.get("key2")
       
     println(value1) // Some("value1")
     println(value2) // None
  
     val a:Option[Int] = Some(5)
     val b:Option[Int] = None 
      
     println("a.getOrElse(0): " + a.getOrElse(0) )  //5
     println("b.getOrElse(10): " + b.getOrElse(10) )  //10
     
     println("a.isEmpty: " + a.isEmpty )  //false
     println("b.isEmpty: " + b.isEmpty )  //true
  
  }

}