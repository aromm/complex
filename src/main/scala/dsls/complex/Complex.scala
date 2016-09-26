package dsls.complex

// we should use this line to enable implicit conversions
import scala.language.implicitConversions

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

  def unary_- = Complex(-1) * this

  override def toString = 
    if (imaginary == 0) 
      s"${real}" 
    else
     s"${real} + ${imaginary}i"
}

// This is called a "companion object"
object Complex {
  implicit def int2complex(i: Int): Complex = Complex(i)
}
