package scala.com.chsoft.common

import scala.collection.immutable.List
import scala.util.control.Breaks


object DbUtils {
  
  def main(args: Array[String]) {
      /*var a = 10;
      while( true ){
         println( "Value of a: " + a );
      }*/
    
    /*var a :Int = 0;
      do{
           println( "Value of a: " + a );
           a=a+1;
        }while( a<=10 );
    */
    
    /*
    var a = 0;
    for( a <- 1 to 10){//相当于java中的循环
       println( "Value of a: " + a );
    }
    */
    
    /*
      var a = 0;
      var b = 0;
      for( a <- 1 to 3; b <- 1 to 3){//相当于java中的嵌套循环
         println( "Value of a: " + a );
         println( "Value of b: " + b );
      }*/
    
    /*
      val list=List(1,2,3,4,5);
      for( a <- list){//相当于java中的list迭代
       println( "Value of a: " + a );
      }
      
      val strings=List("1q","2q","3q","4q","5q");
      for( a <- strings){//相当于java中的list迭代
       println( "Value of a: " + a );
      }
      */
    
      /*
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with multiple filters
      for( a <- numList if a != 3; if a < 8 ){//for循环中使用if判断语句(1,2,4,5,6,7)
         println( "Value of a: " + a );
      }*/
    
    /*
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with a yield
      var retVal = for{ a <- numList 
                        if a != 3; if a < 8
                      }yield a

      // Now print returned values using another loop.
      for( a <- retVal){// 1,2,4,5,6,7
         println( "Value of a: " + a );
      }
        */
    
      /*
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      val loop = new Breaks;
      loop.breakable {
         for( a <- numList){
            println( "Value of a: " + a );
            if( a == 4 ){
               loop.break;
            }
         }
      }
      println( "After the loop" );
//      Value of a: 1
//      Value of a: 2
//      Value of a: 3
//      Value of a: 4
//      After the loop
      */
    
      var a = 0;
      var b = 0;
      val numList1 = List(1,2,3,4,5);
      val numList2 = List(11,12,13);

      val outer = new Breaks;
      val inner = new Breaks;

      outer.breakable {
         for( a <- numList1){
            println( "Value of a: " + a );
            inner.breakable {
               for( b <- numList2){
                  println( "Value of b: " + b );
                  if( b == 12 ){
                     inner.break;
                  }
               }
            } // inner breakable
         }
      } // outer breakable.
      
      
      
   }
  
}