package dima

object ws2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(292); 

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) {
      1
    } else if (money < 0) {
    	0
    } else if (coins.isEmpty) {
      0
    } else {
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(57); val res$0 = 

  countChange(300, List(5, 10, 20, 50, 100, 200, 500));System.out.println("""res0: Int = """ + $show(res$0))}
}
