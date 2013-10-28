package dima

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
    other
  }
  override def toString() = {
  	"{" + left + element + right + "}"
  }
}

object Empty extends IntSet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(787); 
  def incl(x: Int) = {
    new NonEmpty(x, Empty, Empty)
  };System.out.println("""incl: (x: Int)dima.NonEmpty""");$skip(41); 
  def contains(x: Int) = {
    false
  };System.out.println("""contains: (x: Int)Boolean""");$skip(45); 
  def union(other: IntSet) = {
    other
  };System.out.println("""union: (other: dima.IntSet)dima.IntSet""");$skip(41); 
  override def toString() = {
  	"."
  };System.out.println("""toString: ()String""")}
}

object ws5 {
	val set = NonEmpty(10, Empty, Empty)
}
