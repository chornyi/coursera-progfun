package week5

object ws1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(219); 

  def init[T](xs: List[T]): List[T] = {
    xs match {
      case List() => throw new Error("init of empty list")
      case List(x) => List()
      case y :: ys => y :: init(ys)
    }
  };System.out.println("""init: [T](xs: List[T])List[T]""");$skip(244); 

  def removeAt[T](n: Int, xs: List[T]): List[T] = {
    xs match {
      case List() => xs
      case head :: tail => {
        if (n == 0) {
          tail
        } else {
          head :: removeAt(n - 1, tail)
        }
      }
    }
  };System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(257); 

  def flatten(xs: List[Any]): List[Any] = {
    xs match {
      case List() => List()
      case head :: tail => {
        (head match {
          case l: List[Any] => flatten(l)
          case l => List(l)
        }) ::: flatten(tail)
      }
    }
  };System.out.println("""flatten: (xs: List[Any])List[Any]""");$skip(329); 

  def merge(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case (List(), ys) => ys
      case (xs, List()) => xs
      case (head1 :: tail1, head2 :: tail2) => {
        if (head1 > head2) {
          head2 :: merge(xs, tail2)
        } else {
          head1 :: merge(tail1, ys)
        }
      }
    };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(32); 

  val list = List(1, 2, 3, 4);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(54); val res$0 = 

  flatten(List(List(1, 1), 2, List(3, List(5, 8))));System.out.println("""res0: List[Any] = """ + $show(res$0));$skip(142); 

  def squareList1(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => {
    	(y * y) :: squareList1(ys)
    }
  };System.out.println("""squareList1: (xs: List[Int])List[Int]""");$skip(72); 

  def squareList2(xs: List[Int]): List[Int] =
    xs map (y => y * y);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(180); 
    
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 => {
    	xs.span(e => e == x)._1 :: pack(xs.span(e => e == x)._2)
    }
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(51); val res$1 = 
  
  pack(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res1: List[List[String]] = """ + $show(res$1));$skip(159); 
                                                  
  def encode[T](xs: List[T]): List[(T, Int)] = {
    pack(xs).map(e => {
    	(e.head, e.length)
    })
  };System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(112); 
  
  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( (a, b) => f(a) :: b );System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(86); val res$2 = 
                                                  
  mapFun(list, (e : Int) => e * e);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(81); 
  
	def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)( (a, b) => b + 1 );System.out.println("""lengthFun: [T](xs: List[T])Int""");$skip(62); val res$3 = 
    
   
  lengthFun(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res3: Int = """ + $show(res$3));$skip(55); val res$4 = 
  

  encode(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res4: List[(String, Int)] = """ + $show(res$4));$skip(46); val res$5 = 

  merge(List(1, 3, 5, 7), List(2, 4, 6, 8));System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(15); val res$6 = 

  init(list);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(23); val res$7 = 
  
  squareList1(list);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(23); val res$8 = 
  
  squareList2(list);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(22); val res$9 = 

  removeAt(1, list);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(46); 

  println("Welcome to the Scala worksheet")}
}
