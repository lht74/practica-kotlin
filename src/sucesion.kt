
/*Ejemplo de definición de función recursiva.
  Definimos una sucesión aritmética que recibe como parámetros tres enteros
  n: Cantidad de términos
  a1: primer término
  y dif: diferencia */


fun succession(n:Int=1, a1 : Int =5, dif :Int =0):Int {
    var aux = 0
    aux = if (n == 1) a1
    else succession(n-1, a1, dif)+ dif
    return aux
}


fun main() {
    for (i in 1..10 )
        println("a($i) = ${succession(n= i, a1 = 100, dif = -5)}; ")
}