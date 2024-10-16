package `when`


/* simplemente itera sobre los caracteres de una
palabra y cuenta las vocales ( prestar atención a las tildes 'é ' )
 */


fun main() {
 val palabra = "murciélago"
 var result = 0
    for (ch in palabra) {
        result += when (ch) {
             'a', 'e','é','i','o','u' -> 1
            else -> 0

        }
    println(result)
    }

}