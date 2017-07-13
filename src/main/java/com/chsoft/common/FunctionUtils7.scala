package scala.com.chsoft.common

import java.util.Date

object FunctionUtils7 {
    
   def main(args: Array[String]) {
      val date = new Date
      val logWithDateBound = log(date, _ : String)//这里的 _ ：String 表示是占位符，参数类型为string类型 

      logWithDateBound("message1" )
      Thread.sleep(1000)
      logWithDateBound("message2" )
      Thread.sleep(1000)
      logWithDateBound("message3" )
   }

   def log(date: Date, message: String)  = {
     println(date + "----" + message)
   }
  
   
   
//    Wed Nov 09 21:58:58 CST 2016----message1
//    Wed Nov 09 21:58:58 CST 2016----message2
//    Wed Nov 09 21:58:58 CST 2016----message3
}