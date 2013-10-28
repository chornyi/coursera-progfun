package misc

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def +(that: Nat): Nat
  def -(that: Nat): Nat
  
  override def toString() = {
    if (this.isZero) {
    	"."  
    } else {
      "." + this.predecessor.toString
    }
  }
}

object Zero extends Nat {
  def isZero: Boolean = {
    true
  }

  def predecessor = {
    throw new UnsupportedOperationException
  }

  def successor = {
    new Succ(Zero)
  }

  def +(that: Nat): Nat = {
    that
  }

  def -(that: Nat): Nat = {
    if (that.isZero) {
      this
    } else {
    	throw new UnsupportedOperationException  
    }
    
  }
}

class Succ(n: Nat) extends Nat {
  def isZero: Boolean = {
    false
  }
  def predecessor: Nat = {
    n
  }
  def successor: Nat = {
    new Succ(this)
  }
  def +(that: Nat): Nat = {
    if (that.isZero) {
      this
    } else {
      this.successor + that.predecessor
    }
  }
  def -(that: Nat): Nat = {
    if (that.isZero) {
      this
    } else {
      this.predecessor - that.predecessor
    }
  }
}