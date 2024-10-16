
fun main() {

    val lista = listOf<Any>("Juan", "Carlos", "Mascachicle", 45)
    val ( nombre, segNombre, apellido, edad) = lista
    println(nombre)
    println(segNombre)
    println(apellido)
    println(edad)

    for (i in lista )
        println(i)

    val nacimiento: Int = 2024 - edad.toString().toInt()
    println(nacimiento)



}