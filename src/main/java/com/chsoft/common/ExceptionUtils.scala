package scala.com.chsoft.common

import java.io.FileNotFoundException
import java.io.IOException
import java.io.FileReader

object ExceptionUtils {

  def main(args: Array[String]) {

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("FileNotFoundException"+ex.getMessage)
      }
      case ex: IOException => {
        println("IOException")
      }
    }finally{  //finally 语句用于执行不管是正常处理还是有异常发生时都需要执行的步骤
      println("＝＝＝我始终会被执行＝＝＝")
    }
    
    
  }
  
   def matchTest(x: Int){
      x match{
        case 1 if x<=4 => println("one")
        case 2 => println("two")
        //case _x => println("age"+_x)
        case _ => println("many")
      }
      
   }
  
}