package rangos

fun String.enCrypt():String{
    var aux=""
    for (i in 0..this.lastIndex){
        aux += this[i]+1
    }

    return aux
}
fun String.deCrypt():String{
    var aux=""
    for (i in 0..this.lastIndex){
        aux += this[i]-1
    }

    return aux
}

fun main() {
    val frase ="Hola mundo! Esto es un encriptado muy sencillo"
    val encriptado = frase.enCrypt()
    println(encriptado)
    println()
    println(encriptado.deCrypt())





    }




