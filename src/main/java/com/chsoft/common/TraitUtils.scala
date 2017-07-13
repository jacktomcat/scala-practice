package scala.com.chsoft.common

trait TraitUtils {
    
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
  
  def isNotEqual1(x: Any): Boolean = {  //等同上面方法的写法
       !isEqual(x)
  } 
  
}


class Point extends TraitUtils {
  override def isEqual(obj: Any) =   //这里的override可有可无，因为父类定义中没有任何实现
    obj.isInstanceOf[Point]
  
  override def isNotEqual(x: Any)= false   //这里的override必须有，因为父类定义有实现，需要重写
}


object TestUtils {
   def main(args: Array[String]) {
      println(matchTest("two"))  //精准匹配 case "two"
      println(matchTest("test")) //default 匹配 case _
      println(matchTest(1))      //精准匹配  case 1 
      println(matchTest(6))      //类型匹配，对应case y int类型的
   }
   
   
   def matchTest(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
   }
   
}