import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestCases extends AnyFlatSpec with Matchers {

  "isPalindrome" should "throw IllegalArgumentException for empty string" in {
    assertThrows[IllegalArgumentException] {
      PalindromeChecker.isPalindrome("")
    }
  }

  it should "return true for single character string" in {
    PalindromeChecker.isPalindrome("a") should be(true)
  }

  it should "return true for two character palindrome" in {
    PalindromeChecker.isPalindrome("aa") should be(true)
  }

  it should "return false for two character non-palindrome" in {
    PalindromeChecker.isPalindrome("ab") should be(false)
  }

  it should "return true for three character palindrome" in {
    PalindromeChecker.isPalindrome("aba") should be(true)
  }

  it should "return false for three character non-palindrome" in {
    PalindromeChecker.isPalindrome("abc") should be(false)
  }

  it should "return true for even length palindrome" in {
    PalindromeChecker.isPalindrome("AbbA") should be(true)
  }

  it should "return true for odd length palindrome" in {
    PalindromeChecker.isPalindrome("deified") should be(true)
  }

  it should "return true for a string with non-ASCII characters" in {
    PalindromeChecker.isPalindrome("été") shouldBe true
  }

  it should "return true for a long palindrome" in {
    PalindromeChecker.isPalindrome("A Santa at NASA") shouldBe true
  }

  it should "return true for a string with spaces and punctuation" in {
    PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama!") shouldBe true
  }

  it should "return true for a string that is palindrome but letter case issue" in {
    PalindromeChecker.isPalindrome("Abba") shouldBe true
  }
}
