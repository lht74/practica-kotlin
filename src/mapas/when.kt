package mapas

val ejemplo = mapOf(

    1 to "uno",
    2 to "dos",
    3 to "tres",
    4 to "cuatro",
    5 to "cinco"
)


fun main() {

   fun convertToliteral(i:Int):String =
       when(i){
        6 -> "seis"
        7 -> "siete"
        8 -> "ocho"
        9 -> "nueve"
        10 -> "diez"
         else -> ejemplo.getValue(i)
       }

   for (i in 1..10 ) println("$i  ,  ${convertToliteral(i)}")


}

