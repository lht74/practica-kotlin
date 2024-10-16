package sobrecargaDeOperadores

class Fraction( numerator: Int, denominator:Int) {
     val nume: Int
     val deno:Int

    init {
        require(denominator != 0){"El denominador no puede ser igual a 0 "}
       fun gcd(a:Int,b:Int):Int = if (a % b == 0) b else gcd (b, a % b)
       val gcd = gcd(numerator,denominator)
        this.nume = numerator /gcd
        this.deno =denominator/gcd
    }

    override fun toString(): String {
        return if ( nume % deno == 0 ) "${nume/deno}"
               else "$nume/$deno "
    }

  operator fun plus(other:Fraction):Fraction{
      val newnum = this.nume * other.deno + other.nume * this.deno
      val newden = this.deno * other.deno
      return Fraction(newnum,newden)

  }

  operator fun plus (n:Int):Fraction{
       return Fraction(n,1) + this

  }

  operator  fun times(other: Fraction):Fraction= with(this){
      return Fraction(nume * other.nume, deno * other.deno)
     }


    fun inverse (num: Fraction):Fraction = with(num){
        return Fraction(deno , nume)
    }

    operator fun div(other: Fraction):Fraction {
        return this * inverse(other)
    }


}