package exercises

class Book(_title: String, _authors: Array[String], _publisher: String, _isbn: String) {
  
  private var t = _title
  
  def title: String = t
  def title_=(v: String) {t = v}    
}

object Program {
  def main(args: Array[String]) = {
    val book = new Book("1984", Array("George Orwell"), "Penguin", "9780881030365")
    
    println(book.title)
    
    book.title = "The 1984"
      
    println(book.title)  
   
  }
}
