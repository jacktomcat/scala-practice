package com.chsoft.common

import java.util.Date

object FunctionUtils8 {
    
   def main(args: Array[String]) {
      println("value====="+add(3,4));
      println("value====="+add1(3)(4));
      
      val buf = new StringBuilder;
      
      var floatVar = 12.456
      var intVar = 2000
      var stringVar = "菜鸟教程!"
      var fs = printf("浮点型变量为 " +
                   "%f, 整型变量为 %d, 字符串为 " +
                   " %s", floatVar, intVar, stringVar)
      println(fs)
      
      var hello = new HelloOOP
      hello.hello
      
   }

   def add(x:Int,y:Int)=x+y
  
   def add1(x:Int)(y:Int) = x + y
   
   var name :String="";
   
   
//    Wed Nov 09 21:58:58 CST 2016----message1
//    Wed Nov 09 21:58:58 CST 2016----message2
//    Wed Nov 09 21:58:58 CST 2016----message3
}