package dima

object ws5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
	val set = new NonEmpty(10, Empty, Empty);System.out.println("""set  : dima.NonEmpty = """ + $show(set ));$skip(24); 
	val set1 = set incl 15;System.out.println("""set1  : dima.NonEmpty = """ + $show(set1 ));$skip(24); 
	val set2 = set1 incl 5;System.out.println("""set2  : dima.NonEmpty = """ + $show(set2 ));$skip(44); 
	
	val set3 = new NonEmpty(9, Empty, Empty);System.out.println("""set3  : dima.NonEmpty = """ + $show(set3 ));$skip(25); 
	val set4 = set3 incl 12;System.out.println("""set4  : dima.NonEmpty = """ + $show(set4 ));$skip(24); 
	val set5 = set4 incl 7;System.out.println("""set5  : dima.NonEmpty = """ + $show(set5 ));$skip(30); 
	
	val set6 = set2 union set5;System.out.println("""set6  : dima.IntSet = """ + $show(set6 ));$skip(63); 
	
	val list = new Cons(1, new Cons(2, new Cons(3, new Nil())));System.out.println("""list  : dima.Cons[Int] = """ + $show(list ));$skip(67); val res$0 = 
                                                  
  list.index(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(33); 
  
  val list1 = list.List(1, 2);System.out.println("""list1  : dima.List[Int] = """ + $show(list1 ))}
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
