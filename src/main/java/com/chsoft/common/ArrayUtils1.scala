package com.chsoft.common

import Array._
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap
import scala.collection.immutable.Map
import scala.collection.mutable.Map

/**
 * 大数据技术是数据的集合以及对数据集合的操作技术的统称，具体来说：
 *  1、数据集合：会涉及数据的搜集、存储等，搜集会有很多技术，存储现在比较经典的是使用Hadoop,也有很多情况使用
 *  kafka
 *  2、对数据集合的操作技术：目前全球最火爆的是spark
 *  
 *  spark的框架实现语言是scala，首选的应用程序开发语言也是scala，所以scala对集合以及集合操作的支持就至关重要
 *  且必须异常强大，一个补充说明就是spark中对很多数据的操作的算子和scala中对集合的操作算子是一样的！也就是说
 *  你掌握了scala中的集合的操作，基本上就可以直接去开发spark代码啦，
 *  
 *  关于scala中数据的创建与操作：
 *  1、最原始的创建数据的方式是形如 val array = new Array[Int](5),指定数组的类型是Int且固定长度为5
 *  2、对数组元素访问的时候下标的范围在0-(length-1)的话会出现java.lang.ArrayIndexOutOfBoundsException
 *  3、最常用和经典的创建数组的方式是形如Array[Int](1,2,3,4,5)，直接通过Array类名并传入参数的方式
 *  来创建数组实例，在背后的实现是调用Array的工厂方法模式apply来构建出数组及数组的内容的：
 *  4、关于Array本身在底层的实现是借助了JVM平台上的java语言的数组的实现，是不可变的！
 *  5、如果我们想使用可变数组的话，首先需要导入 import scala.collection.mutable.ArrayBuffer,然后使用
 *  ArrayBuffer这个可变数组
 *  6、当需要多线程并发操作的时候，把ArrayBuffer 转化成Array 就非常重要，其实即使是Array，其本身虽然不可变
 *  但是我们可以修改
 *  7、如果想在已经有的数组的基础上通过作用于每个元素来生成新的元素构成的新数组，则可以通过yield语法来完成
 *  8、集合的操作往往可以通过丰富的操作算子，例如filter来过滤需要条件的元素，例如map来进行每一个元素的加工
 */
object ArrayUtils1 {
  
  
  def main(args: Array[String]) {
      var array = new  Array[Int](5)//这里的范型[Int] 可以省略
      var array1 = Array(1,2,3,4,5)//直接推导数组类型
      var array2 = Array.apply(1,2,3,4,5)//工厂方法来创建
      for(item<- array) println(item)  //循环打印
      
      var ab =  ArrayBuffer[Int]();
      ab += 1
      ab += (2,3,4,5)//表示数组5个元素,值分别是1，2，3，4，5
      println(ab.length)
    
      ab ++= Array(1,2,3)
      ab.insert(3, 100,200)//在下标3 插入 100 200
      ab.remove(4)  //移除下标4
      
      ab.toArray
      
      var newArray = for(item<- array1) yield item+1 // yield  用于每个元素来生成新的元素构成的新数组
      for(item<- newArray) println(item)//2,3,4,5,6
      
      println(newArray.filter { x => x%2==0}.mkString(" "))  //2、4、6
      println(newArray.filter { x => x%2==0}.map { x => x*100 }.mkString(" "))// 200 400 600
      println(newArray.filter { _%2==0}.map { _*100 }.mkString(" "))//上面写法或者这种写法都可以
      
      var map1 = new HashMap
      //var map2 = Map
  }
  
}