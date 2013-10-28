package dima

object ws4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  val x = new Rational(1, 3);System.out.println("""x  : dima.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : dima.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : dima.Rational = """ + $show(z ));$skip(21); val res$0 = 
  
  x.sub(y).sub(z);System.out.println("""res0: dima.Rational = """ + $show(res$0))}

}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(r: Rational) =
    new Rational(numer * r.denom + r.numer * denom,
      denom * r.denom)
      
  def neg() = {
  	new Rational(-numer, denom)
  }

  def sub(r: Rational) = {
  	add(r.neg())
  }
  
  override def toString = numer + "/" + denom
}
