package ws

object ws6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 

	def _0 = Zero;System.out.println("""_0: => ws.Zero.type""");$skip(25); 
	
	def _1 = _0.successor;System.out.println("""_1: => ws.Succ""");$skip(23); 
	def _2 = _1.successor;System.out.println("""_2: => ws.Nat""");$skip(23); 
	def _3 = _2.successor;System.out.println("""_3: => ws.Nat""");$skip(20); 
	
	def _5 = _2 + _3;System.out.println("""_5: => ws.Nat""");$skip(19); 
	def _10 = _5 + _5;System.out.println("""_10: => ws.Nat""");$skip(19); 
	def _7 = _10 - _3;System.out.println("""_7: => ws.Nat""");$skip(23); 
	
	def __10 = _0 + _10;System.out.println("""__10: => ws.Nat""");$skip(15); 

  println(_1);$skip(14); 
  println(_2);$skip(14); 
  println(_3);$skip(14); 
  println(_5);$skip(15); 
  println(_10);$skip(14); 
  println(_7);$skip(16); 
  println(__10)}
  
}
