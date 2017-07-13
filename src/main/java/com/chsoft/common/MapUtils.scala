package com.chsoft.common



object MapUtils {
 
  def main(args: Array[String]): Unit = {
    var immutableMap = scala.collection.immutable.Map("zhuhh"->34,"wxr"->20)//不可变map,初始化用->,那么推导key(String),value(Int)
    //immutableMap("zhuhh")=35   这里不能修改，修改直接编译报错
    for((name,age)<-immutableMap) println("name=="+name+",age=="+age)
    
    var mutableMap = scala.collection.mutable.Map("zhuhh"->34,"wxr"->20)//可变map,初始化用->,那么推导key(String),value(Int)
    mutableMap("zhuhh")=35   //这里可以修改
    for((name,age)<-mutableMap) println("name=="+name+",age=="+age)
    
    var mutableMap1 = scala.collection.mutable.Map(("zhuhh",23),("wxr",20))//可变map,也可以采用(key,value),(key,value)进行赋值
    for((name,age)<-mutableMap1) println("name=="+name+",age=="+age)
    
    var mutableHashMap = scala.collection.mutable.HashMap(("zhuhh",23),("wxr",20))  //这里没有用new，表明使用object的hashmap的apply
    var mutableHashMap1 = new scala.collection.mutable.HashMap[String,Int]  //这里实例化的是一个hashmap的class
    mutableHashMap1("zhuhh")=35   //赋值方式一，
    mutableHashMap1 += (("jack",20))  //赋值方式二 tuple方式
    mutableHashMap1 += ("tomcat"->20)  //赋值方式三  
    mutableHashMap1 -= ("tomcat")   //删除集合中的元素
    
    for((name,age)<-mutableHashMap1) println("name=="+name+",age=="+age)//循环便利
    println(mutableHashMap1.get("jboss")); //如果没有key，返回none
    println(mutableHashMap1.getOrElse("jboss", "jackjboss"));  //如果没有key，有一个默认值
    
    for(name<-mutableHashMap1.keySet) println("key=="+name)//循环key
    for(value<-mutableHashMap1.values) println("value=="+value)//循环value
    
    //打印 name=jack2,age=23   name=zhuhh2,age=38,这里使用yield修改循环值，重新赋值给新的map，原来map不变
    var newMap = for((name,age)<-mutableHashMap1) yield (name+"2",age+3)
    for((name,age)<-newMap) println("name=="+name+",age=="+age)//循环便利
    
    var json = ("zhuhh",30,"男","beijing","IT")
    println(json._1+"=="+json._2+"==="+json._3)  //zhuhh==30==男
    
    
    var json1 = (("zhuhh",30,"男","beijing","IT"),("jackjboss",22,"女","nanjing","IT"))
    println(json1._1._1+"=="+json1._2._1)  //zhuhh==jackjboss
   
  }
  
}