package week6

object ws2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 

  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2);System.out.println("""p1  : week6.Poly = """ + $show(p1 ));$skip(51); 

  val p2 = new Poly(2 -> 3.0, 3 -> 5.0, 5 -> 6.2);System.out.println("""p2  : week6.Poly = """ + $show(p2 ));$skip(13); val res$0 = 
  
  p1 + p2;System.out.println("""res0: week6.Poly = """ + $show(res$0))}
  
}

class Poly(terms0: Map[Int, Double]) {
  def this(bindings: (Int, Double)*) = this(bindings.toMap)
  val terms = terms0 withDefaultValue 0.0
  
  def + (other: Poly) = new Poly((other.terms foldLeft terms)(addTerm))
  
	def addTerm(terms: Map[Int, Double], term: (Int, Double)) : Map[Int, Double] = {
		val (key, value) = term
		terms + (key -> (terms(key) + value))
	}
  
  override def toString = (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
}
