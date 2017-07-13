package com.chsoft.common

/**
 *   1、	可以使用new ClassName的方式构建出类的对象
 *   2、	如果名称相同，则object中的内容都是class的静态内容，也就是
 *   object中的内容class都可以在没有实例的时候直接去吊用，正是因为可以在没有类的实例的时候去调用object中的一切内容，
 *   所以可以使用object中的特定方法来创建类的实例，而这个特定方法就是apply方法
 *   3、	object中的apply方式是class对象生成的工厂方法，用于控制对象的生成
 *   4、	很多框架的代码一般直接调用抽象类的object的apply方法生成类的实例对象：
 *      第一：其秘诀在于apply具有类的对象生成的一切生杀大权，抽象类是不可以直接实例化的，在apply方法中可以实例化抽象类的子类，以spark中的图计算为例，Graph是抽象的class，在object Graph中的apply方法实际上是调用了Graph的子类的GraphImpl来构建Graph类型的
 *      第二：这种方式神奇的效应在于更加能够应对代表版本迭代或者修改变化，这是更高意义的面向接口编程
 *      object HelloOOP是class HelloOOP的伴生对象，class HelloOOP可以直接访问object HelloOOP中的一切内容，
 *      而class HelloOOP是object HelloOOP伴生类，object HelloOOP可以直接访问class HelloOOP的一切内容，一个特例是用private［this］修饰的成员
 *   5、	在定义scala中的class的时候可以直接在类后面（）里加入类的构造参数，此时在apply方法中也必须有这些参数
     6、	scala中可以在object中构造很多apply方法
     7、scala中的很多集合都是使用apply的方式构造的，例如Array:
 *      
 */
  class HelloOOP{
  var name = "hello";
  var result = println("my name is "+name)
  
  def hello{
    println("class HelloOOP hello"+HelloOOP.sex);
    HelloOOP.getSex
  }
}

object HelloOOP{
   
     def main(args: Array[String]): Unit = {
         var hello = new HelloOOP()
         hello.result   //  my name is hello
       
         var hello1 = HelloOOP()  //注意这里没有使用 new，因为object HelloOOP 中的apply 中已经实例化了
         hello1.result
     }
     
     def apply():HelloOOP={
         new HelloOOP
     }
     
     private val sex:String="sex"
     private def getSex{
       println("getSex")
     }
}
