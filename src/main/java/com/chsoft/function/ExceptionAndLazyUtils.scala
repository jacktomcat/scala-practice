package com.chsoft.function

/**
  * Created by zhuhuihui on 16/12/10.
  * 异常和lazy
  */
object ExceptionAndLazyUtils extends  App{

  try{
     //7/0
     println(Int.MaxValue / 1024 / 1024)
  }catch {
    case indexOutOfBoundsException:IndexOutOfBoundsException => println("indexOutOfBoundsException: "+indexOutOfBoundsException.toString)
    case arithmeticException : ArithmeticException => println("arithmeticException: "+ arithmeticException.toString)
    case noSuchElementException:NoSuchElementException =>println("noSuchElementException: "+ noSuchElementException.toString)
  }

  lazy val name="jackjboss"  //延迟加载,在没有调用之前为null
  println(name)
}
