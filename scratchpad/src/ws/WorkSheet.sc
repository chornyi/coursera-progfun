package ws

object WorkSheet {

  def and(x: Boolean, y: => Boolean) = if (x) y else false
                                                  //> and: (x: Boolean, y: => Boolean)Boolean

  and(false, false)                               //> res0: Boolean = false
  and(true, false)                                //> res1: Boolean = false
  and(false, true)                                //> res2: Boolean = false
  and(true, true)                                 //> res3: Boolean = true

  def or(x: Boolean, y: => Boolean) = if (x) true else y
                                                  //> or: (x: Boolean, y: => Boolean)Boolean

  or(false, false)                                //> res4: Boolean = false
  or(true, false)                                 //> res5: Boolean = true
  or(false, true)                                 //> res6: Boolean = true
  or(true, true)                                  //> res7: Boolean = true
}