package scala.com.chsoft.common


import scala.util.control.Breaks._

/**
 * object 作为scala中的一个关键字，相当于java中的public static class 修饰符，也就是说object的成员
 * 都是静态的，所以例子中的main也是静态的，不需要实例化就可以被虚拟机调用，而这正是做为jvm平台入口的前提条件
 * 
 * 疑问：object是不是一个对象，事实是object是scala中的一个静态类
 * 从spark的master和worker源码中，入口函数都是从main开始的
 * 
 */
object ArrayUtils {
  
  /**
   * 1、def是什么，def是scala的关键字，所有用def定义的内容都是函数或者方法
   * 2、这里的main是方法，因为被def定义且不具有函数特性
   * 3、main是scala语言中规定的scala的应用程序的入口
   * 4、args：array［string］其中args是参数名称
   * 5、unit表明main入口方面的类型是unit，也就是说执行main方法后返回的unit类型，相当于java中的void，无返回值
   * 6、＝是什么？是表明main方法执行的结果是由谁来赋值的
   * 7、方法体一般有｛｝来封装，里面可以有很多条语句
   * 8、｛｝语句块默认情况下最后一条语句的结果类型就是｛｝的返回类型
   * 9、如果方法或者函数的返回类型为unit类型，那么可以直接把  “：unit=” 可以去掉，其他非unit类型不可以去掉，比如：def main(args:array[string]){}
   * 10、按照当今的os的原理，程序的main入口方法都是运行在主线程中的，os的运行氛围kernel space和user space，应用程序是运行在user space中，
   *     应用程序scala所在的进程一般都是透过os fork出来，被fork出来的应用程序进程默认会有主线程，而我们的main方法就是默认在主线程中的。
   * 
   */
  def main(args: Array[String]) {
     var z:Array[String] = new Array[String](3)
     var z1 = new Array[String](3)
     
     z(0) = "Runoob"; 
     z(1) = "Baidu"; 
     z(4/2) = "Google"
     
     var z2 = Array("Runoob", "Baidu", "Google")
     
     for(i<- 0 to z2.length-1){
       println(z2(i)+" ");
     }
     
     //*****************************************************************
     /**
      * 1、scala中的表达式是有值的！！！！和java不一样
      * 2、如果if后面没有else语句默认实现是if(...) else ()
      * SparkContext源码在else中的部分else{ None },没有任何意义，但是没有省略，因为他返回的是Option类型
      * 而不是Any类型，所以SparkContext中的else{None}不能省略
      * 
      */
     var age=30
     var result = if(age>25) "gt 25" else "le 25"
     println(result);
     
     var result2 = if(age>34) "gt 25" else 1 //result2 为Any类型，因为返回的值有字符类型和int类型
     println(result2);
     
     var result3 = if(age>34) "gt 25"//此处相当于 if(age>34) "gt 25" else (),返回类型为Any类型
     println(result3);
     
     
     //*****************************************************************
     /**
      * 1、补充说明：{...}代表了一个语句块，语句块是有值的，值就是最后一条语句，值类型就是最后一条语句的类型
      * 
      */
      val price=3
      var x,y=0
      var rst=
      if(price<10){
        x=x+1
        y=y+1
        x+y   //这里就是默认的返回值，最后一句话
      }else 0
      println(rst);
      
     //*****************************************************************
      breakable(
          for(i<- 0 to 5 if i==2){
               println("内部："+i)
               break;
            }
      )
      println("===========break 了========");
       
      
      var flag = true
      var sum=0
      for(i<- 0 to 6 if flag){
        sum = sum+1
        if(i==5) flag = false
      }
      println("sum====:"+sum);
       
      for(iterm<- "spark")println(iterm);   //打印 s p a r k
      for(iterm<- "hello spark".split(" "))println(iterm) //打印hello spark
  }
  
}