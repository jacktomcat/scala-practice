package com.chsoft.common

import scala.actors.Actor

/**
  * Created by zhuhuihui on 16/12/4.
  */
object ActorUtils {

  def main(args: Array[String]): Unit = {

      val ha = new HelloActor()
      ha.start()

    val hba = new HelloBackActor(ha)
    hba.start()

  }

}

case class Hellos(name:String,content:String,send:Actor)
case class HellosBack(name:String,content:String,send:Actor)

class HelloActor extends  Actor{
  var counter=0
  def act(): Unit ={
     while(true){
       receive{
         case content:String=>println("Hello Message: "+content)
         case Hellos(name,content,send)=>{

           println("Actor name: "+name+" ,content: "+content + counter)
           counter+=1

           Thread.sleep(2000)

           send ! HellosBack(name,content+counter,this)
         }
       }

     }

  }
}



class HelloBackActor(val helloActor: Actor) extends  Actor{
  var counter=0
  def act(): Unit ={
    helloActor ! Hellos("Spark","Love is over",this)
    while(true){
      receive{
        case content:String=>println("Hello Message: "+content)
        case HellosBack(name,content,send)=>{

          println("BackActor name: "+name+" ,content: "+content + counter)
          counter+=1

          Thread.sleep(2000)

          send ! Hellos(name,content+counter,this)
        }
      }

    }

  }
}