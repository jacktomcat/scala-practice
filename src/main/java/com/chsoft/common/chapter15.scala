package com.chsoft.common

/**
  * Created by zhuhuihui on 16/12/3.
  */
class Animal[T] (val category:T){
    def getAnimal(category:T):T = category
}


class Persons(val name:String) {

  def talk(person: Persons): Unit ={
    println (
      person.name + "====" + this.name
    )
  }
}

class Worker(name:String) extends Persons(name)

class Dog(val name:String)

class Club[T <% Persons](t1:T,t2:T){

  def result = t1.talk(t2)
}

/*class Club[T <: Persons](t1:T,t2:T){

  def result = t1.talk(t2)
}*/

class Engineer
class Expert extends  Engineer
class Meeting[+T]  //逆变



object chapter15 {

  def communication(meeting:Meeting[Engineer]): Unit ={
    println("hello work")
  }

  def main(args: Array[String]): Unit = {

    val engineer = new Meeting[Engineer]
    val expert = new Meeting[Expert]
    communication(engineer)
    communication(expert)

    /*implicit  def dog2person(dog:Dog) = new Persons(dog.name)
    val p = new Persons("persons")
    val w = new Worker("worker")
    val d = new Dog("dog")

    new Club[Persons](w,d).result*/

    /*val c0 = new Club[Persons](p,p)
    c0.result

    val c1 = new Club[Persons](p,w)
    c1.result

    val c2 = new Club[Persons](w,p)
    c2.result

    val c3 = new Club[Worker](w,w)
    c3.result*/

  }


}
