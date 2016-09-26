package dsls.complex

case class Complex(real: Double = 0, imaginary: Double = 0) {
  def +(other: Complex) = {
    val newReal = this.real + other.real
    val newImaginary = this.imaginary + other.imaginary
    Complex(newReal, newImaginary)
  }
    
  def *(other: Complex) = {
    val newReal = (this.real * other.real) - (this.imaginary * other.imaginary)
    val newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real)
    Complex(newReal, newImaginary)
  }

  override def toString = 
    if (imaginary == 0) 
      s"${real}" 
    else
     s"${real} + ${imaginary}i"
}
