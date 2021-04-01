import scala.xml.{Elem, NodeSeq}
object XMLApp extends App {
  val person: Elem = <person>
    <firstName>Mano</firstName>
    <lastName>P</lastName>
    <days>
      <weekday>
        <day order="1">Monday</day>
        <day order="2">Tuesday</day>
        <day order="3">Wednesday</day>
        <day order="4">Thursday</day>
        <day order="5">Friday</day>
      </weekday>
      <weekend>
        <day>Saturday</day>
        <day>Sunday</day>
      </weekend>
    </days>
  </person>

  //From the root level tag
  val seq_level_1: NodeSeq = person \ "firstName"
  println("Root level tags")
  println(seq_level_1)

  //Second level tags
  val seq_level_2: NodeSeq = person \\ "weekday"
  println("\nSecond level tags")
  println(seq_level_2)

  //Third level tags
  val seq_level_3: NodeSeq = person \\ "day"
  println("\nThird level tags")
  println(seq_level_3)

  //Pretty print Third level tags
  val seq_level_3_pretty_print: NodeSeq = person \\ "day"
  println("\nPretty print third level tags")
  seq_level_3_pretty_print.map(day => println(day))

  //Query with tag's properties
  val seq_tags: NodeSeq = person \\ "@order"
  println("\nQueried with tag's properties")
  println(seq_tags)

  //Print square root of the values in order property
  seq_tags.map(order => println(Math.sqrt(order.toString().toInt)))
}