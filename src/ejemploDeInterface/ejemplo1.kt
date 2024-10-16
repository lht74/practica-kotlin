package ejemploDeInterface

interface Movible {
    fun mover()
}

interface Sonido{
    fun sonar()
}

class Carro (val marca:String):Movible,Sonido{
    override fun mover() {
        println("El auto $marca se está moviendo")
    }

    override fun sonar() {
      println("El auto marca $marca toca la bocina")
    }
}

class Bicileta (val tipo:String): Movible,Sonido{
    override fun mover() {
        println("la bicicleta $tipo se está moviendo" )
    }

    override fun sonar() {
        println("La bicicleta $tipo toca la campana")
    }

}

fun main() {
    val movible1 = Carro("Ford")
    val movible2 = Bicileta("MTB")

    movible1.mover()
    movible2.mover()
    movible1.sonar()
    movible2.sonar()

}