package ws

object ws4 {
  val x = new Rational(1, 3)                      //> x  : ws.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : ws.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : ws.Rational = 3/2
  
  x.sub(y).sub(z)                                 //> res0: ws.Rational = -79/42

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