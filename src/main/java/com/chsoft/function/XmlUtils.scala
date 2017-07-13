package com.chsoft.function

/**
  * Created by zhuhuihui on 16/12/11.
  */
object XmlUtils extends App{

  //从xml中加载内容
  val s = scala.xml.XML.loadFile("/Users/zhuhuihui/person.xml").mkString
  println(s)
  println(scala.xml.XML.loadFile("/Users/zhuhuihui/person.xml").attribute("id"))
  println(scala.xml.XML.loadFile("/Users/zhuhuihui/person.xml").toList)


  val patten  = "[a-z]+".r
  var findAllIn = patten.findAllIn("Spark is a good language 123").mkString
  var findFirstIn = patten.findFirstIn("Spark is a good language 123")
  println(findFirstIn)
  println(findAllIn)
}
