package com.chsoft.common

object FunctionUtils5 {
  
  
   def main(args: Array[String]) {
        println( "Returned Value : " + addInt() );
   }
   
   
   def addInt( a:Int=5, b:Int=7 ) : Int = {//默认参数
      var sum:Int = 0
      sum = a + b

      return sum
   }
  
}