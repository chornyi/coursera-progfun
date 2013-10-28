package week5

object ws1 {

  def init[T](xs: List[T]): List[T] = {
    xs match {
      case List() => throw new Error("init of empty list")
      case List(x) => List()
      case y :: ys => y :: init(ys)
    }
  }                                               //> init: [T](xs: List[T])List[T]

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
  }                                               //> removeAt: [T](n: Int, xs: List[T])List[T]

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
  }                                               //> flatten: (xs: List[Any])List[Any]

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
    }                                             //> merge: (xs: List[Int], ys: List[Int])List[Int]

  val list = List(1, 2, 3, 4)                     //> list  : List[Int] = List(1, 2, 3, 4)

  flatten(List(List(1, 1), 2, List(3, List(5, 8))))
                                                  //> res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  def squareList1(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => {
    	(y * y) :: squareList1(ys)
    }
  }                                               //> squareList1: (xs: List[Int])List[Int]

  def squareList2(xs: List[Int]): List[Int] =
    xs map (y => y * y)                           //> squareList2: (xs: List[Int])List[Int]
    
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 => {
    	xs.span(e => e == x)._1 :: pack(xs.span(e => e == x)._2)
    }
  }                                               //> pack: [T](xs: List[T])List[List[T]]
  
  pack(List("a", "a", "a", "b", "c", "c", "a"))   //> res1: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a)
                                                  //| )
                                                  
  def encode[T](xs: List[T]): List[(T, Int)] = {
    pack(xs).map(e => {
    	(e.head, e.length)
    })
  }                                               //> encode: [T](xs: List[T])List[(T, Int)]
  
  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( (a, b) => f(a) :: b )
                                                  //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
                                                  
  mapFun(list, (e : Int) => e * e)                //> res2: List[Int] = List(1, 4, 9, 16)
  
	def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)( (a, b) => b + 1 )           //> lengthFun: [T](xs: List[T])Int
    
   
  lengthFun(List("a", "a", "a", "b", "c", "c", "a"))
                                                  //> res3: Int = 7
  

  encode(List("a", "a", "a", "b", "c", "c", "a")) //> res4: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))

  merge(List(1, 3, 5, 7), List(2, 4, 6, 8))       //> res5: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)

  init(list)                                      //> res6: List[Int] = List(1, 2, 3)
  
  squareList1(list)                               //> res7: List[Int] = List(1, 4, 9, 16)
  
  squareList2(list)                               //> res8: List[Int] = List(1, 4, 9, 16)

  removeAt(1, list)                               //> res9: List[Int] = List(1, 3, 4)

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}