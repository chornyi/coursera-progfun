package dima

object ws7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  println("Welcome to the Scala worksheet")}
}

trait CustomList {
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
      if (x > y) {
        x :: ys
      } else {
        y :: insert(x, ys)
      }
    }
  }
}
