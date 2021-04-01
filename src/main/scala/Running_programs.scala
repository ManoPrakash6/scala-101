//Program #1
object Running_programs {

  //Function Definition
  def multiply(first: Int, second: Int): Int = first * second

  //main function
  def main(args: Array[String]): Unit = {
    //Initialsiing Variables
    var a: Int = 100
    val b: Int = 20

    //print variables
    println(a + 32)

    //Invoke functions
    print("Multiplication of " + a + " and " + b + " gives " + multiply(a,b))
  }
}
