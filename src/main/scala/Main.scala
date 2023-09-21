import scala.io.StdIn.readLine

@main def camelCase () = {
  val camel = readLine().split("-").map(_.capitalize).mkString("")
  println(camel)
}
