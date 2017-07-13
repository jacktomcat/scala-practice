package com.chsoft.function

/**
  * Created by zhuhuihui on 16/12/10.
  * 偏函数
  */
object PartialUtils extends  App{

  val example = 1 to 10

  //[]中的参数两个参数表示:输入、输出参数类型
  var isEven:PartialFunction[Int,Unit] = {
    case x if x%2==0 => println(x + " is even")
  }

  //[]中的参数两个参数表示:输入、输出参数类型
  var isOdd:PartialFunction[Int,String] = {
    case x if x%2==1 => x + " is odd"
  }

  //isEven(4)
  //println(isOdd(3))

  var numbers = example.map(isEven orElse isOdd)
  numbers.foreach(println)

}
