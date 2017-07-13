package com.chsoft.common

object FunctionUtils4 {
  
   def main(args: Array[String]) {
        printStrings("Hello", "Scala", "Python");
   }
   
   def printStrings( args:String* ) = {//参数可变参数
      var i : Int = 0;
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
  
}