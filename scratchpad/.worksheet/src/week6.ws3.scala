package week6

object ws3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(53); 

  val word = "testing";System.out.println("""word  : String = """ + $show(word ));$skip(180); val res$0 = 

  word.toLowerCase().toCharArray.distinct.groupBy(char => word.toLowerCase().count(_ == char)).toList.flatMap(item => for (char <- item._2) yield (char -> item._1)).sortBy(_._1);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(154); val res$1 = 

  List.fromArray(for (character <- word.toLowerCase().toCharArray.distinct) yield (character -> word.toLowerCase().count(_ == character))).sortBy(_._1)

  type Occurrences = List[(Char, Int)];System.out.println("""res1: List[(Char, Int)] = """ + $show(res$1));$skip(89); 

  val occurrences1 = List(('a', 2), ('b', 2));System.out.println("""occurrences1  : List[(Char, Int)] = """ + $show(occurrences1 ));$skip(36); 
  val occurrences2 = List(('b', 2));System.out.println("""occurrences2  : List[(Char, Int)] = """ + $show(occurrences2 ));$skip(395); 

  def combinations(occurrences: Occurrences): List[Occurrences] = {
    occurrences match {
      case List() => List(List())
      case occurence :: tail => {
        println(occurrences)
        for {
          combination <- combinations(tail)
          counter <- 0 to occurence._2
        } yield ((occurence._1, occurence._2 - counter) :: combination).filter(_._2 > 0)
      }
    }
  };System.out.println("""combinations: (occurrences: week6.ws3.Occurrences)List[week6.ws3.Occurrences]""");$skip(31); val res$2 = 

  combinations(occurrences1);System.out.println("""res2: List[week6.ws3.Occurrences] = """ + $show(res$2));$skip(54); val res$3 = 

  occurrences2.toMap.withDefaultValue(0).apply('a');System.out.println("""res3: Int = """ + $show(res$3));$skip(150); val res$4 = 

  occurrences1.toMap.map(item => item._1 -> (item._2 - occurrences2.toMap.withDefaultValue(0).apply(item._1))).toList.filter(_._2 > 0).sortBy(_._1);System.out.println("""res4: List[(Char, Int)] = """ + $show(res$4))}

}
