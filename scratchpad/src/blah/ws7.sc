package blah

object ws7 {
	 def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
      if (x > y) {
        y :: x :: ys
      } else {
        y :: insert(x, ys)
      }
    }
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
  
  insert(10, List(5, 15, 20))                     //> res0: List[Int] = List(5, 10, 15, 20)

  println("Welcome to the Scala worksheets")      //> Welcome to the Scala worksheets
}