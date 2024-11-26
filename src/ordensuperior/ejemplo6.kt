package ordensuperior

/* Uso de la función de orden superior sortedWith()

 */


data class Personas (
    val name: String,
    val age: Int
)

fun main() {
    val grupo = listOf(
         Personas("Juan",35),
         Personas("Juan",36),
         Personas("Carlos",40),
         Personas("Daniel",40),
         Personas("Pedro",50),
         Personas("Romualdo",55),

    )

    val grupoOrdenadoEdad = grupo.sortedWith(compareBy { it.name })
    println(grupoOrdenadoEdad)

    val grupoOrdenadoNombre = grupo.sortedWith(compareBy { it.age })
    println(grupoOrdenadoNombre)


    val grupoOrdenadoNombreYedad = grupo.sortedWith(compareBy ( { it.age }, {it.name}) )
    println(grupoOrdenadoNombreYedad)

}

