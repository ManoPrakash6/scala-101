object Scala_1 {
  
  def main(args: Array[String]): Unit = {
    val salaries = Seq(1, 2, 3)
    val doubleSalary = (x: Int) =>  println(x) + "1"
    val newSalaries = salaries.map(doubleSalary)
    println(newSalaries)
    println(salaries)
  }
}