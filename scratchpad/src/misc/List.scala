package misc

abstract class List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def index(n: Int): T

  def List() : List[T] = {
    new Nil()
  } 
  
  def List(arg1: T) : List[T] = {
    new Cons(arg1, new Nil())
  }
  
  def List(arg1: T, arg2 : T) : List[T] = {
    new Cons(arg1, List(arg2))
  }
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {

  def isEmpty = false

  def index(n: Int): T = {
    if (n == 0) {
      head
    } else {
      tail.index(n - 1)
    }
  }

}

class Nil[T] extends List[T] {

  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
  def index(n: Int) = throw new IndexOutOfBoundsException("" + n)

}