package scala.com.chsoft.common

object FunctionPragramming {
  
  def main(args: Array[String]): Unit = {
    
    //在这里，直接把下面的函数赋值给变量，注意 _,
    //函数和变量一样，作为scala语言的一等公民，函数可以直接赋值给变量
    var bd = bigData _
    bd("jack")  //可以直接调用
    
    //函数更常用的方式是匿名函数，定义的时候只需要说明输入参数的类型和函数体即可，不需要名称，但是如果你要使用的话，
    //一般会把这个匿名函数赋值给一个变量（其实是val常量），spark源码中大量存在这种语法，必须掌握
    var f = (name:String)=>println("hello "+name)
    
    def getName(func:(String) =>Unit,name:String){
      func(name)
    }
    getName(f,"jackjboss")
    
    
    def f2(message:String) = (name:String)=>println("hello "+name+" message:"+message)
    f2("tack")("jack")
    //上面的写法等同于下面的写法
    var fr = f2("tack")
    fr("jack")
  }
  
  def bigData(name:String){
    println("Hi: "+name)
  }
  
}