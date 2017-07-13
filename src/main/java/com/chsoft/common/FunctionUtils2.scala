package scala.com.chsoft.common

object FunctionUtils2 {
  
   def main(args: Array[String]) {
        printInt(b=5, a=7);//按照参数名字进行传递
   }
   
   def printInt( a:Int, b:Int ) = {
      println("Value of a : " + a );
      println("Value of b : " + b );
   }
  
}