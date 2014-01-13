package exercises

object ListUtils {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(115); 
  def printList[T](l: List[T]): Unit =
    println(l.mkString("[", ",", "]"));System.out.println("""printList: [T](l: List[T])Unit""");$skip(25); 
    
  printList(List());$skip(36); 
  
  printList(List(1,2,3,4,5,6,7));$skip(37); 
  
  val doubled = (x: Int) => x * 2;System.out.println("""doubled  : Int => Int = """ + $show(doubled ));$skip(53); 
  
  
  val and = (a: Boolean, b: Boolean) => a && b;System.out.println("""and  : (Boolean, Boolean) => Boolean = """ + $show(and ));$skip(56); 
  
  val nand = (a: Boolean, b: Boolean) => ! and(a, b);System.out.println("""nand  : (Boolean, Boolean) => Boolean = """ + $show(nand ));$skip(16); val res$0 = 
  
  doubled(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); val res$1 = 
  
  and(true, false);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(23); val res$2 = 
  
  nand(true, false);System.out.println("""res2: Boolean = """ + $show(res$2))}
}
