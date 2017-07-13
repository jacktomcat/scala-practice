package com.chsoft.common

object FunctionUtils6 {
    
   def FunctionUtils6(x:Int){}
  
   def main(args: Array[String]) {
        println( "Returned Value : " + inc(1) );
        println( "Returned Value : " + mul(4,5) );
        println("value = "+dec(4));
        println( userDir() )
        
        
        //FunctionUtils5.addInt(a, b)
   }
   
   var inc = (x:Int) => x+1
   
   var mul = (x: Int, y: Int) => x*y
   
   def dec (x:Int) =x+1
   
   var userDir = () => { System.getProperty("user.dir") }
  
}