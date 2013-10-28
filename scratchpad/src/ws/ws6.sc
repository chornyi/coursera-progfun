package ws

object ws6 {

	def _0 = Zero                             //> _0: => ws.Zero.type
	
	def _1 = _0.successor                     //> _1: => ws.Succ
	def _2 = _1.successor                     //> _2: => ws.Nat
	def _3 = _2.successor                     //> _3: => ws.Nat
	
	def _5 = _2 + _3                          //> _5: => ws.Nat
	def _10 = _5 + _5                         //> _10: => ws.Nat
	def _7 = _10 - _3                         //> _7: => ws.Nat
	
	def __10 = _0 + _10                       //> __10: => ws.Nat

  println(_1)                                     //> ..
  println(_2)                                     //> ...
  println(_3)                                     //> ....
  println(_5)                                     //> ......
  println(_10)                                    //> ...........
  println(_7)                                     //> ........
  println(__10)                                   //> ...........
  
}