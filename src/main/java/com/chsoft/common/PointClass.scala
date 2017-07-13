package scala.com.chsoft.common

class Person{
   var name = ""
   override def toString = getClass.getName + "[name1=" + name + "]"
}

class Employee extends Person {
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"  //重写父类的构造方法
}


object Test extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}

/*
object Test1 {
  
  def main(args: Array[String]): Unit = {
    val fred = new Employee
    fred.name = "Fred"
    fred.salary = 50000
    println(fred)
  }
  
}*/
