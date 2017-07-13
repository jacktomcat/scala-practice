package com.chsoft.function

/**
  * Created by zhuhuihui on 16/12/10.
  */


//object Man{
//  implicit def man2SuperMan(man:Man) = new SuperMan(man.name)  //如果在class man中不使用val,那么这里没法直接使用man.name
//}

class Man(val name:String)

object implicts{
  implicit def man2SuperMan(man:Man) = new SuperMan(man.name)
}

class SuperMan(name:String){

  def makeMan = println(name + " wow wow")
}

object ImplicitUtils extends App{

  import com.chsoft.function.implicts._
  val man = new Man("Spark")
  man.makeMan   //Spark  wow wow

  implicit val content = "spark"
  talk("zhuhh")("hello")  //zhuhh====hello
  talk("zhuhh")   //zhuhh====spark   //这里申明了一个implicit的content的变量,可以自动传递

  def talk(name:String)(implicit content:String) = println(name+"===="+content)
}
