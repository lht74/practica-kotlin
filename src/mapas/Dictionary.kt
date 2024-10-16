package mapas

class Dictionary{

    private val _translations = mutableMapOf<String,List<String>>()

    val translations: Map<String,List<String>>
        get() = _translations

    fun addTranslation( word: String, trad: String){
        if (_translations.containsKey(word)) {
            println("Error: $word ya tiene traducción en el diccionario" )
            return
        }
        _translations[word] = trad.split(" ")

    }

    fun showTranslationEsEng (palabra: String){
        if (_translations.containsKey(palabra))
        println("$palabra --to english--> ${_translations.getValue(palabra)}")
        else {
            println("$palabra --to english-->  ... ? " +
                    "(Todavía no se ha incorporado una traducción para \'$palabra\' )")

        }


    }
}


fun main() {
    val dict = Dictionary()

    dict.addTranslation("uno", "one")
    dict.addTranslation("uno", "first")
    dict.showTranslationEsEng("uno")
    dict.addTranslation("dos", "two")
    dict.showTranslationEsEng("dos")
    dict.showTranslationEsEng("tres")

}