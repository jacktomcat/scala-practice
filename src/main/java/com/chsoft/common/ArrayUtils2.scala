package com.chsoft.common

import Array._
import scala.util.control.Breaks._
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap
import scala.collection.immutable.Map
import scala.collection.mutable.Map

/**
 *
 * 
 */
object ArrayUtils2 {
  
  
  def main(args: Array[String]) {

    // 字符串列表
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val app = site.apply(2)
    println("===app:"+app);
    
    val list = List(1,2,3,4)

    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
    val empty = Nil

    // 二维列表
    val dim = (1 :: (0 :: (0 :: Nil))) ::
              (0 :: (1 :: (0 :: Nil))) ::
              (0 :: (0 :: (1 :: Nil))) :: Nil
              
        
       println( "第一网站是 : " + site.head )
       println( "最后一个网站是 : " + site.tail )
       println( "查看列表 site 是否为空 : " + site.isEmpty )
       println( "查看 nums 是否为空 : " + empty.isEmpty )
      
       val site1 = scala.collection.immutable.List.fill(3)("Runoob")
       site1.iterator.foreach { item => println(":"+item) } 
    
       val t = (4,3,2,"hello")
       val sum = t._1 + t._2 + t._3 + t._4
       
       val t1 = (4,3)
       println("交换后的字符串为: " + t1.swap.toString() )
       
       println(function1(4))
      
       val hello = function2(hello1);
       val result = hello(9)
       println(result+";;;;;;")
       
       println(function2(hello1)(9))
       println(function3(hello1,3)(3))
       println("8===="+function8(3,_:Int,9))
       println(function10(10)(2))
       
       println(function12(10))
    }
  
  
    def function1(n: Int): Int = {
        val multiplier = (i: Int, m: Int) => i * m
        multiplier.apply(n, 2)
    }
    
    def function2(m: Int => Int) = m
    def function2_1(m:(Int,Int) => Int) = m
    def function3(m: Int => Int,age:Int) = m
    def hello1(m: Int): Int = m
    
    def function7(a:Int, b:Int, c:Int) = a+b+c
    val function8 = function7 _
    val function9 = function7(1, _:Int, 3)
    def function10(x:Int) = (y:Int) => x+y
    
    def function12(x: Int): Int = {
        if (x == 0) {
            throw new Exception("bang!")
        }
        else{
            function12(x -1)
        }
    }
    
     // 高阶函数
   def sum(f: Int => Int): (Int, Int) => Int = { 
    def sumF(a: Int, b: Int): Int = 
      if (a > b) 0 else f(a) + sumF(a + 1, b) 

    sumF 
   } 
   
   // 使用高阶函数重新定义求和函数
   //def sumCube: Int = sum(x => x*x*x) 
   //def sumSquare: Int = sum(x => x * x) 
   //def sumFact: Int = sum(fact) 
   //def sumInt: Int = sum(x => x) 
  
}