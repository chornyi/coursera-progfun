package funsets

import FunSets._

object ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(40); 
  
  val set1 = FunSets.singletonSet(1);System.out.println("""set1  : Int => Boolean = """ + $show(set1 ));$skip(37); 
  val set2 = FunSets.singletonSet(2);System.out.println("""set2  : Int => Boolean = """ + $show(set2 ));$skip(28); 
  
  FunSets.printSet(set1);$skip(25); 
  FunSets.printSet(set2);$skip(31); val res$0 = 
  
  FunSets.contains(set1, 1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(28); val res$1 = 
  FunSets.contains(set1, 2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(42); 
  
  val set3 = FunSets.union(set1, set2);System.out.println("""set3  : Int => Boolean = """ + $show(set3 ));$skip(28); 
  
  FunSets.printSet(set3);$skip(31); val res$2 = 
  
  FunSets.contains(set3, 1);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(28); val res$3 = 
  FunSets.contains(set3, 2);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(28); val res$4 = 
  FunSets.contains(set3, 3);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(46); 
  
  val set4 = FunSets.intersect(set1, set3);System.out.println("""set4  : Int => Boolean = """ + $show(set4 ));$skip(28); val res$5 = 
  FunSets.contains(set4, 1);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(28); val res$6 = 
  FunSets.contains(set4, 2);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(28); 
  
  FunSets.printSet(set4);$skip(41); 
  
  val set5 = FunSets.diff(set3, set4);System.out.println("""set5  : Int => Boolean = """ + $show(set5 ));$skip(28); val res$7 = 
  FunSets.contains(set5, 1);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(28); val res$8 = 
  FunSets.contains(set5, 2);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(28); 
  
  FunSets.printSet(set5);$skip(49); 
  
  val set6 = FunSets.filter(set3, n => n > 1);System.out.println("""set6  : Int => Boolean = """ + $show(set6 ));$skip(28); val res$9 = 
  FunSets.contains(set6, 1);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(28); val res$10 = 
  FunSets.contains(set6, 2);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(28); 
  
  FunSets.printSet(set6);$skip(38); val res$11 = 
  
  FunSets.forall(set3, n => n > 1);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(38); val res$12 = 
  
  FunSets.exists(set3, n => n > 1);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(46); 
  
  val set7 = FunSets.map(set3, n => n * n);System.out.println("""set7  : Int => Boolean = """ + $show(set7 ));$skip(28); 
  
  FunSets.printSet(set7)}
}
