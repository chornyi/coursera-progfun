package ws

object ws3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(202); 

  def sum(f: Int => Int)(a: Int, b: Int): Int = {

    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }

    loop(a, 0)
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(33); val res$0 = 

  sum((x: Int) => x * x)(1, 2);System.out.println("""res0: Int = """ + $show(res$0));$skip(138); 

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) {
      1
    } else {
      f(a) * product(f)(a + 1, b)
    }
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(37); val res$1 = 

  product((x: Int) => x * x)(3, 4);System.out.println("""res1: Int = """ + $show(res$1));$skip(82); 

  def factorial(number: Int): Int = {
    product((x: Int) => x)(1, number)
  };System.out.println("""factorial: (number: Int)Int""");$skip(17); val res$2 = 

  factorial(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(227); 

  def sumProduct(f: Int => Int)(a: Int, b: Int)(unitValue: Int, operator: (Int, Int) => Int): Int = {
    if (a > b) {
      unitValue
    } else {
      operator(f(a), sumProduct(f)(a + 1, b)(unitValue, operator))
    }
  };System.out.println("""sumProduct: (f: Int => Int)(a: Int, b: Int)(unitValue: Int, operator: (Int, Int) => Int)Int""");$skip(70); val res$3 = 

  sumProduct((x: Int) => x * x)(3, 4)(1, (x: Int, y: Int) => x * y);System.out.println("""res3: Int = """ + $show(res$3));$skip(62); 
  
  
  
  
  
  
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(28); 
  
  val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(77); 
  def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(69); 

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(235); 

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(90); 
  
  
  def sqrt(number: Double) = {
  	fixedPoint(averageDamp(y => number / y))(1.0)
  };System.out.println("""sqrt: (number: Double)Double""");$skip(10); val res$4 = 
  sqrt(4);System.out.println("""res4: Double = """ + $show(res$4))}

}
