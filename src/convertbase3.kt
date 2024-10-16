

fun main() {
 val numDecimal = 1024
 val base = 2

 var aux = numDecimal
 var resto = 0
 var cociente = numDecimal
 var result = ""

    while (cociente >= base ){

        resto = cociente % base
        cociente /= base
        result += resto.toString()
        println(result)


    }
   result += cociente
    println(result.reversed())






}