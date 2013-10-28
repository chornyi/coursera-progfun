package blah

object ws7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(235); 
	 def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
      if (x > y) {
        y :: x :: ys
      } else {
        y :: insert(x, ys)
      }
    }
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(33); val res$0 = 
  
  insert(10, List(5, 15, 20));System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(46); 

  println("Welcome to the Scala worksheets")}
}
