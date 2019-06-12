// Start writing your ScalaFiddle code here
object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = { 
      var numbers = Set[Int]()
      for (f <- factors) {
        var x = 0
        var mul = f*x
        while(mul < limit){
          numbers = numbers + mul
          x+=1
          mul = f*x
        }
      }
      numbers.sum
  }
}