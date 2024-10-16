package sobrecargaDeOperadores



operator fun Int.plus(q:Fraction):Fraction{
 return Fraction(this,1) + q

}


fun unitaria (arg: Fraction):Fraction = with(arg ){
Fraction(
 1,
 deno
)
}



fun main() {
val q1 = Fraction(3,4)
val q2 = Fraction(4,3)
println("$q1  \n $q2" )
println("$q1 + $q2 = ${q1 + q2}")

 println("$q1 + 1 = ${q1 + 1}")
 println(" 2 + $q1 = ${ 2 + q1}")

 println("$q1 * $q2 = ${q1 * q2}")
 println("/*****************/")

 println("$q1 / $q2 = ${q1 / q2}")
 println("/*****************/")


 val q3 = Fraction(3,5)
 val q4 = Fraction(1,2)
 println("$q3 / $q4 = ${q3 / q4}")
 println("/*****************/")

 println("$q3 y $q4 => ${unitaria( q3)} y ${unitaria( q4)}")
 println("/*****************/")

 println("$q3 / $q4 = ${q3 / q4}")
 println("/*****************/")


}