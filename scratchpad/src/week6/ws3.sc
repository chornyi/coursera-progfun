package week6

object ws3 {

  val word = "testing"                            //> word  : String = testing

  word.toLowerCase().toCharArray.distinct.groupBy(char => word.toLowerCase().count(_ == char)).toList.flatMap(item => for (char <- item._2) yield (char -> item._1)).sortBy(_._1)
                                                  //> res0: List[(Char, Int)] = List((e,1), (g,1), (i,1), (n,1), (s,1), (t,2))

  List.fromArray(for (character <- word.toLowerCase().toCharArray.distinct) yield (character -> word.toLowerCase().count(_ == character))).sortBy(_._1)
                                                  //> res1: List[(Char, Int)] = List((e,1), (g,1), (i,1), (n,1), (s,1), (t,2))

  type Occurrences = List[(Char, Int)]

  val occurrences1 = List(('a', 2), ('b', 2))     //> occurrences1  : List[(Char, Int)] = List((a,2), (b,2))
  val occurrences2 = List(('b', 2))               //> occurrences2  : List[(Char, Int)] = List((b,2))

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
  }                                               //> combinations: (occurrences: week6.ws3.Occurrences)List[week6.ws3.Occurrences
                                                  //| ]

  combinations(occurrences1)                      //> List((a,2), (b,2))
                                                  //| List((b,2))
                                                  //| res2: List[week6.ws3.Occurrences] = List(List((a,2), (b,2)), List((a,1), (b,
                                                  //| 2)), List((b,2)), List((a,2), (b,1)), List((a,1), (b,1)), List((b,1)), List(
                                                  //| (a,2)), List((a,1)), List())

  occurrences2.toMap.withDefaultValue(0).apply('a')
                                                  //> res3: Int = 0

  occurrences1.toMap.map(item => item._1 -> (item._2 - occurrences2.toMap.withDefaultValue(0).apply(item._1))).toList.filter(_._2 > 0).sortBy(_._1)
                                                  //> res4: List[(Char, Int)] = List((a,2))

}