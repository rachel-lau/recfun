package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || c > r) 
      0
    else
      if (c == 0 || (c == r))
        1
      else
        pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def innerBalance(numOpenBrackets: Int, chars: List[Char]) : Boolean = {
      if (chars.isEmpty)
        true
      else {
        val firstElement = chars.head
        val remaining = chars.tail
        if (firstElement == '(')
          innerBalance(numOpenBrackets+1, remaining)
        else if (firstElement == ')')
          if ((numOpenBrackets - 1) < 0) 
            false
          else
            innerBalance(numOpenBrackets-1, remaining)
        else
          innerBalance(numOpenBrackets, remaining)
      }
    }

    innerBalance(0, chars) 
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    0
  }
}
