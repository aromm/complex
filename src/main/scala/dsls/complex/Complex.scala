package dsls.complex

case class Complex(real: Double = 0, imaginary: Double = 0) {
    override def toString = 
    if (imaginary == 0) 
      s"${real}" 
    else
     s"${real} + ${imaginary}i"
}
