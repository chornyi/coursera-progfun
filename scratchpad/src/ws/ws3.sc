package ws

object ws3 {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {

    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }

    loop(a, 0)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int

  sum((x: Int) => x * x)(1, 2)                    //> res0: Int = 5

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) {
      1
    } else {
      f(a) * product(f)(a + 1, b)
    }
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int

  product((x: Int) => x * x)(3, 4)                //> res1: Int = 144

  def factorial(number: Int): Int = {
    product((x: Int) => x)(1, number)
  }                                               //> factorial: (number: Int)Int

  factorial(5)                                    //> res2: Int = 120

  def sumProduct(f: Int => Int)(a: Int, b: Int)(unitValue: Int, operator: (Int, Int) => Int): Int = {
    if (a > b) {
      unitValue
    } else {
      operator(f(a), sumProduct(f)(a + 1, b)(unitValue, operator))
    }
  }                                               //> sumProduct: (f: Int => Int)(a: Int, b: Int)(unitValue: Int, operator: (Int, 
                                                  //| Int) => Int)Int

  sumProduct((x: Int) => x * x)(3, 4)(1, (x: Int, y: Int) => x * y)
                                                  //> res3: Int = 144
  
  
  
  
  
  
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) / x < tolerance
                                                  //> isCloseEnough: (x: Double, y: Double)Boolean

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  
  
  def sqrt(number: Double) = {
  	fixedPoint(averageDamp(y => number / y))(1.0)
  }                                               //> sqrt: (number: Double)Double
  sqrt(4)                                         //> res4: Double = 2.000000000000002

}