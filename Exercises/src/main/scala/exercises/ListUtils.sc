package exercises

object ListUtils {
  def printList[T](l: List[T]): Unit =
    println(l.mkString("[", ",", "]"))            //> printList: [T](l: List[T])Unit
    
  printList(List())                               //> []
  
  printList(List(1,2,3,4,5,6,7))                  //> [1,2,3,4,5,6,7]
  
  val doubled = (x: Int) => x * 2                 //> doubled  : Int => Int = <function1>
  
  
  val and = (a: Boolean, b: Boolean) => a && b    //> and  : (Boolean, Boolean) => Boolean = <function2>
  
  val nand = (a: Boolean, b: Boolean) => ! and(a, b)
                                                  //> nand  : (Boolean, Boolean) => Boolean = <function2>
  
  doubled(3)                                      //> res0: Int = 6
  
  and(true, false)                                //> res1: Boolean = false
  
  nand(true, false)                               //> res2: Boolean = true
}