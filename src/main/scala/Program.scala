import dsls.complex.Complex

object Program extends App {

  // This import statement gives us top-levle access to everything defined in 
  // the Complex object, 
  import Complex._

  println( 2 * (1 + 2*i) )
}
