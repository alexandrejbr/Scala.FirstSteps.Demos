package exercises

object Sample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 
  val i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(18); 

  val x = i * 2;System.out.println("""x  : Int = """ + $show(x ));$skip(29); 

  val l = List(1, 2, 3, 4);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(11); val res$0 = 

  9 :: l;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(11); val res$1 = 

  8 :: l;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(6); val res$2 = 

  l

  object WarAndPeace {
    val title: String = "War and Peace"
    val authors: Array[String] = Array("Leo Tolstoy")
  };System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(145); val res$3 = 

  WarAndPeace.title;System.out.println("""res3: String = """ + $show(res$3));$skip(25); val res$4 = 
  WarAndPeace.authors(0)

  class Book(private var _title: String) {
    def title: String = _title
    def title_=(v: String) { _title = v }
  };System.out.println("""res4: String = """ + $show(res$4));$skip(155); 
  
  val book = new Book("1984");System.out.println("""book  : exercises.Sample.Book = """ + $show(book ));$skip(61); 
                                   
  val title = book.title;System.out.println("""title  : String = """ + $show(title ));$skip(29); 
  book.title = "Animal Farm";$skip(13); val res$5 = 
  book.title;System.out.println("""res5: String = """ + $show(res$5))}
  
  
  abstract class Greeter {
  	val message: String
  	def sayHi() = println(message)
  }
  
  class PortugueseGreeter extends Greeter {
  	val message = "Ola mundo!"
  }
                         
}
