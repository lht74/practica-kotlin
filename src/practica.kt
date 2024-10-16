


class Reino{
   val animal = Animal()
    val fungi = Fungi()
    val vegetable = Vegetable()

}

class Animal{
    var aves = Aves()
    var mammal = Mamiferos()
    var peces = Peces()

}

class Aves{
    var name: String? = null
    }
class Mamiferos {
    var name: String? =null
}

class Peces {
    var name: String? = null
}

class Fungi{
    var name: String? = null
}
class Vegetable{
    var name: String? = null
}



fun main() {
   val bicho = Reino()
    bicho.animal.mammal.name = "Perro"
   val perro: String? =  bicho.animal.mammal.name
    println(perro)

   val texto: String = """|Si te postran diez veces, te levantas
|otras diez, otras cien, otras quinientas:
|no han de ser tus caídas tan violentas
|ni tampoco, por ley, han de ser tantas.
|Con el hambre genial con que las plantas
|asimilan el humus avarientas,
|deglutiendo el rencor de las afrentas
|se formaron los santos y las santas.
|Obsesión casi asnal, para ser fuerte,
|nada más necesita la criatura,
|y en cualquier infeliz se me figura
|que se mellan los garfios de la suerte...
|¡Todos los incurables tienen cura
|cinco segundos antes de su muerte! """

    println(texto.trimMargin(marginPrefix = "|" ))



}
