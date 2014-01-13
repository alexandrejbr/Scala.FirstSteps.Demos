package exercises

object Sample {
  val i = 1                                       //> i  : Int = 1

  val x = i * 2                                   //> x  : Int = 2

  val l = List(1, 2, 3, 4)                        //> l  : List[Int] = List(1, 2, 3, 4)

  9 :: l                                          //> res0: List[Int] = List(9, 1, 2, 3, 4)

  8 :: l                                          //> res1: List[Int] = List(8, 1, 2, 3, 4)

  l                                               //> res2: List[Int] = List(1, 2, 3, 4)

  object WarAndPeace {
    val title: String = "War and Peace"
    val authors: Array[String] = Array("Leo Tolstoy")
  }

  WarAndPeace.title                               //> res3: String = War and Peace
  WarAndPeace.authors(0)                          //> res4: String = Leo Tolstoy

  class Book(private var _title: String) {
    def title: String = _title
    def title_=(v: String) { _title = v }
  }
  
  val book = new Book("1984")                     //> book  : exercises.Sample.Book = exercises.Sample$$anonfun$main$1$Book$1@30f3
                                                  //| c90f
                                   
  val title = book.title                          //> title  : String = 1984
  book.title = "Animal Farm"
  book.title                                      //> res5: String = Animal Farm
  
  
  abstract class Greeter {
  	val message: String
  	def sayHi() = println(message)
  }
  
  class PortugueseGreeter extends Greeter {
  	val message = "Ola mundo!"
  }
                         
}