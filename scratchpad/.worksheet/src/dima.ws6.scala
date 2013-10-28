package dima

object ws6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); 

	def _0 = Zero;System.out.println("""_0: => dima.Zero.type""");$skip(25); 
	
	def _1 = _0.successor;System.out.println("""_1: => dima.Succ""");$skip(23); 
	def _2 = _1.successor;System.out.println("""_2: => dima.Nat""");$skip(23); 
	def _3 = _2.successor;System.out.println("""_3: => dima.Nat""");$skip(20); 
	
	def _5 = _2 + _3;System.out.println("""_5: => dima.Nat""");$skip(19); 
	def _10 = _5 + _5;System.out.println("""_10: => dima.Nat""");$skip(19); 
	def _7 = _10 - _3;System.out.println("""_7: => dima.Nat""");$skip(23); 
	
	def __10 = _0 + _10;System.out.println("""__10: => dima.Nat""");$skip(15); 

  println(_1);$skip(14); 
  println(_2);$skip(14); 
  println(_3);$skip(14); 
  println(_5);$skip(15); 
  println(_10);$skip(14); 
  println(_7);$skip(16); 
  println(__10)}
  
}
