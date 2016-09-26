import dsls.complex.Complex

object Program extends App {
  val c1 = Complex(1, 2)
  val c2 = Complex(1, 2)
  println(s"c1 == c2?: ${c1 == c2}")
  println(c1)
  println(c2)
}
