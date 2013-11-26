package exercises

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class tests extends FunSuite {  
  
  test("Exercise 0.1 - one is equal to one") {
    val always = 1 

    assert(always == 1)
  }
  
  test("Exercise 0.2 - the max between 3 and 6 is 6") {
    def max(i1: Int, i2: Int): Int = {
      if(i1 >= i2) i1 else i2
    }
    
    assert(max(3,6) == 6)
  }
  
  test("Exercise - lambda expression"){
    val less = ??? //(i1: Int, i2: Int) => i1 < i2
    
    val unorderedList = List(9,5,2,6,3,1,8,4,7)
    
    val orderedList = Sorting.msort(less)(unorderedList)
    
    assert(orderedList.equals(List(1, 2, 3, 4, 5, 6, 7, 8, 9)))
  }
}