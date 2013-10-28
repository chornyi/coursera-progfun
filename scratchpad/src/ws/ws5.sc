package ws

object ws5 {
	val set = new NonEmpty(10, Empty, Empty)  //> set  : ws.NonEmpty = {.10.}
	val set1 = set incl 15                    //> set1  : ws.NonEmpty = {.10{.15.}}
	val set2 = set1 incl 5                    //> set2  : ws.NonEmpty = {{.5.}10{.15.}}
	
	val set3 = new NonEmpty(9, Empty, Empty)  //> set3  : ws.NonEmpty = {.9.}
	val set4 = set3 incl 12                   //> set4  : ws.NonEmpty = {.9{.12.}}
	val set5 = set4 incl 7                    //> set5  : ws.NonEmpty = {{.7.}9{.12.}}
	
	val set6 = set2 union set5                //> set6  : ws.IntSet = {{{.5.}7.}9{{.10.}12{.15.}}}
	
	val list = new Cons(1, new Cons(2, new Cons(3, new Nil())))
                                                  //> list  : ws.Cons[Int] = ws.Cons@45990e2
                                                  
  list.index(1)                                   //> res0: Int = 2
  
  val list1 = list.List(1, 2)                     //> list1  : ws.List[Int] = ws.Cons@1436e7a9
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class NonEmpty(element: Int, left: IntSet, right: IntSet) extends IntSet {

  def incl(x: Int) = {
    if (x > element) {
      new NonEmpty(element, left, right incl x)
    } else if (x < element) {
      new NonEmpty(element, left incl x, right)
    } else {
      this
    }
  }

  def contains(x: Int) = {
    if (x > element) {
      right contains x
    } else if (x < element) {
      left contains x
    } else {
      true
    }
  }
  def union(other: IntSet) = {
    right union (left union (other incl element))
  }
  override def toString() = {
  	"{" + left + element + right + "}"
  }
}

object Empty extends IntSet {
  def incl(x: Int) = {
    new NonEmpty(x, Empty, Empty)
  }
  def contains(x: Int) = {
    false
  }
  def union(other: IntSet) = {
    other
  }
  override def toString() = {
  	"."
  }
}