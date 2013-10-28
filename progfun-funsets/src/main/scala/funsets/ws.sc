package funsets

import FunSets._

object ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val set1 = FunSets.singletonSet(1)              //> set1  : Int => Boolean = <function1>
  val set2 = FunSets.singletonSet(2)              //> set2  : Int => Boolean = <function1>
  
  FunSets.printSet(set1)                          //> {1}
  FunSets.printSet(set2)                          //> {2}
  
  FunSets.contains(set1, 1)                       //> res0: Boolean = true
  FunSets.contains(set1, 2)                       //> res1: Boolean = false
  
  val set3 = FunSets.union(set1, set2)            //> set3  : Int => Boolean = <function1>
  
  FunSets.printSet(set3)                          //> {1,2}
  
  FunSets.contains(set3, 1)                       //> res2: Boolean = true
  FunSets.contains(set3, 2)                       //> res3: Boolean = true
  FunSets.contains(set3, 3)                       //> res4: Boolean = false
  
  val set4 = FunSets.intersect(set1, set3)        //> set4  : Int => Boolean = <function1>
  FunSets.contains(set4, 1)                       //> res5: Boolean = true
  FunSets.contains(set4, 2)                       //> res6: Boolean = false
  
  FunSets.printSet(set4)                          //> {1}
  
  val set5 = FunSets.diff(set3, set4)             //> set5  : Int => Boolean = <function1>
  FunSets.contains(set5, 1)                       //> res7: Boolean = false
  FunSets.contains(set5, 2)                       //> res8: Boolean = true
  
  FunSets.printSet(set5)                          //> {2}
  
  val set6 = FunSets.filter(set3, n => n > 1)     //> set6  : Int => Boolean = <function1>
  FunSets.contains(set6, 1)                       //> res9: Boolean = false
  FunSets.contains(set6, 2)                       //> res10: Boolean = true
  
  FunSets.printSet(set6)                          //> {2}
  
  FunSets.forall(set3, n => n > 1)                //> res11: Boolean = false
  
  FunSets.exists(set3, n => n > 1)                //> res12: Boolean = true
  
  val set7 = FunSets.map(set3, n => n * n)        //> set7  : Int => Boolean = <function1>
  
  FunSets.printSet(set7)                          //> {1,4}
}