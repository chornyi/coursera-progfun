package dima

object WorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 

  def and(x: Boolean, y: => Boolean) = if (x) y else false;System.out.println("""and: (x: Boolean, y: => Boolean)Boolean""");$skip(22); val res$0 = 

  and(false, false);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(19); val res$1 = 
  and(true, false);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(19); val res$2 = 
  and(false, true);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(18); val res$3 = 
  and(true, true);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(59); 

  def or(x: Boolean, y: => Boolean) = if (x) true else y;System.out.println("""or: (x: Boolean, y: => Boolean)Boolean""");$skip(21); val res$4 = 

  or(false, false);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(18); val res$5 = 
  or(true, false);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(18); val res$6 = 
  or(false, true);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(17); val res$7 = 
  or(true, true);System.out.println("""res7: Boolean = """ + $show(res$7))}
}
