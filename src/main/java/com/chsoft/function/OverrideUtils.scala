package com.chsoft.function

import scala.annotation.varargs


/**
  * Created by zhuhuihui on 16/12/10.
  */
class Persons {
    val counter=5
    val arrays = new Array[Int](counter)
}

class Sporter extends {
    override val counter=4
} with Persons

object OverrideUtils extends App{

    val sporter = new Sporter
    println(sporter.arrays.length)//这里打印出的 sporter arrays的length为0



    private var name:String = _ //这里申明一个占位符
    name = "abc"
    println(name)

    process("hello","jack")

    @varargs
    def process(args: String*){
       args.foreach(println)
    }




}
