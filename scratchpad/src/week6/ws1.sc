package week6

object ws1 {

  def isPrime(n: Int): Boolean = {
    (2 until n).forall(i => n % i != 0)
  }                                               //> isPrime: (n: Int)Boolean

  isPrime(5)                                      //> res0: Boolean = true

  def scalarProduct(xs: List[Double], ys: List[Double]): Double = {
    (for ((i, j) <- xs zip ys) yield i * j).sum
  }                                               //> scalarProduct: (xs: List[Double], ys: List[Double])Double

  scalarProduct(List(1, 2), List(1, 2))           //> res1: Double = 5.0

  def isSafe(col: Int, queens: List[Int]): Boolean = {
    (queens forall (_ != col)) &&
      ((queens.length != col) || ((queens zip (queens.length to 0 by -1)) forall { case (position, order) => position != order }))
  }                                               //> isSafe: (col: Int, queens: List[Int])Boolean

  isSafe(1, List(0, 2))                           //> res2: Boolean = true

  case class Book(title: String, authors: List[String])

  val books: List[Book] = List(Book(title = "Structure and Interpretation of Computer Programs", authors = List("Abelson, Harald", "Sussman, Gerald J.")), Book(title = "Introduction to Functional Programming", authors = List("Bird, Richard", "Wadler, Phil")), Book(title = "Effective Java", authors = List("Bloch, Joshua")), Book(title = "Java Puzzlers", authors = List("Bloch, Joshua", "Gafter, Neal")), Book(title = "Programming in Scala", authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))
                                                  //> books  : List[week6.ws1.Book] = List(Book(Structure and Interpretation of C
                                                  //| omputer Programs,List(Abelson, Harald, Sussman, Gerald J.)), Book(Introduct
                                                  //| ion to Functional Programming,List(Bird, Richard, Wadler, Phil)), Book(Effe
                                                  //| ctive Java,List(Bloch, Joshua)), Book(Java Puzzlers,List(Bloch, Joshua, Gaf
                                                  //| ter, Neal)), Book(Programming in Scala,List(Odersky, Martin, Spoon, Lex, Ve
                                                  //| nners, Bill)))

  def booksByAuthorName(books: List[Book]): List[String] = {
    books.flatMap(book => book.authors.withFilter(_ startsWith "Bird").map(a => book.title))
  }                                               //> booksByAuthorName: (books: List[week6.ws1.Book])List[String]

  booksByAuthorName(books)                        //> res3: List[String] = List(Introduction to Functional Programming)

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}