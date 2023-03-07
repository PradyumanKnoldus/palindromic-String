/* NOTE : A string is a sequence of characters enclosed in double quotes,
 and can include letters, digits, punctuation, and other symbols.So a
 sentence can be represented as a string. This program works for palindromic sentences also */

object PalindromeChecker {

  //To check whether the String is a Palindromic String
  def isPalindrome(inputString: String): Boolean = {
    if (inputString.isEmpty) {
      throw new IllegalArgumentException("Input String is Empty !")
    } else {

      //To replace both punctuation characters and spaces in a sentence
      val cleanedString = inputString.replaceAll("[\\p{P}\\p{Z}]+", "").toLowerCase
      if (cleanedString == cleanedString.reverse) true else false
    }
  }

  def main(args: Array[String]): Unit = {

    try {
      val input = scala.io.StdIn.readLine("Enter a string: ")

      if (isPalindrome(input)) {
        println("YES")
      } else {
        println("NO")
      }
    } catch {
      case e: Exception =>
        println("An error occurred: " + e.getMessage)
    }
  }
}