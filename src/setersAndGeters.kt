class Length {
    private var current = 0.0
    private var unit = "in"

    var inches: Double
        set(now) {
            current = now
            unit = "in"
        }
        get(): Double =
            if (unit == "in")
                current
            else
                current / 2.54

    var centimeters: Double
        set(now) {
            current = now
            unit = "cm"
        }
        get(): Double =
            if (unit == "cm")
                current
            else
                current * 2.54
}

class Speed{

    private var current= 0.0
    private var unidad = "km/h"

    var kmHora : Double
        set(value) {
            current = value
            unidad = "km/h"

        }
        get() : Double =
            if (unidad == "km/h")
                current
            else current * 3.6

    var mSeg: Double

        set(value) {
            current = value
            unidad = "m"
              }

        get() :Double =
            if (unidad == "m")
               current
            else current / 3.6


}



fun main() {
    val length = Length()
    length.inches = 10.0
    println("Inches: ${length.inches}") // Output: Inches: 10.0
    println("Centimeters: ${length.centimeters}") // Output: Centimeters: 25.4

    length.centimeters = 254.0
    println("Centimeters: ${length.centimeters}") // Output: Centimeters: 30.0
    println("Inches: ${length.inches}") // Output: Inches: 11.811023622047244

    val velocity = Speed()
    val velenkm = 72.0
    val velenm = 10.0

    velocity.mSeg = velenm
    println("$velenm metros/segundo =  ${velocity.mSeg}  metros/segundo") // Output:
    println("$velenm metros/segundo =  ${velocity.kmHora} kilómetros/hora") // Output:

    velocity.kmHora = velenkm


    println("$velenkm kilómetros/hora =  ${velocity.kmHora} kilómetros/hora")
    println("$velenkm kilómetros/hora =  ${velocity.mSeg}  metros/segundo")





}
