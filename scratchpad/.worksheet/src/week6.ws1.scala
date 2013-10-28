package week6

object ws1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 

  def isPrime(n: Int): Boolean = {
    (2 until n).forall(i => n % i != 0)
  };System.out.println("""isPrime: (n: Int)Boolean""");$skip(15); val res$0 = 

  isPrime(5);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(122); 

  def scalarProduct(xs: List[Double], ys: List[Double]): Double = {
    (for ((i, j) <- xs zip ys) yield i * j).sum
  };System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(42); val res$1 = 

  scalarProduct(List(1, 2), List(1, 2));System.out.println("""res1: Double = """ + $show(res$1));$skip(226); 

  def isSafe(col: Int, queens: List[Int]): Boolean = {
    (queens forall (_ != col)) &&
      ((queens.length != col) || ((queens zip (queens.length to 0 by -1)) forall { case (position, order) => position != order }))
  };System.out.println("""isSafe: (col: Int, queens: List[Int])Boolean""");$skip(26); val res$2 = 

  isSafe(1, List(0, 2))

  case class Book(title: String, authors: List[String]);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(569); 

  val books: List[Book] = List(Book(title = "Structure and Interpretation of Computer Programs", authors = List("Abelson, Harald", "Sussman, Gerald J.")), Book(title = "Introduction to Functional Programming", authors = List("Bird, Richard", "Wadler, Phil")), Book(title = "Effective Java", authors = List("Bloch, Joshua")), Book(title = "Java Puzzlers", authors = List("Bloch, Joshua", "Gafter, Neal")), Book(title = "Programming in Scala", authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")));System.out.println("""books  : List[week6.ws1.Book] = """ + $show(books ));$skip(160); 

  def booksByAuthorName(books: List[Book]): List[String] = {
    books.flatMap(book => book.authors.withFilter(_ startsWith "Bird").map(a => book.title))
  };System.out.println("""booksByAuthorName: (books: List[week6.ws1.Book])List[String]""");$skip(29); val res$3 = 

  booksByAuthorName(books);System.out.println("""res3: List[String] = """ + $show(res$3));$skip(46); 

  println("Welcome to the Scala worksheet")}
}
