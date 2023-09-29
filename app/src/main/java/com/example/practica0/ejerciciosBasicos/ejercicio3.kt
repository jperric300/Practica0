//Tarea 3 - Obtener la cadena de caracteres más larga contenida en un listado de cadenas.

fun main(){

    var list:List<String> = listOf("car","hello","one")

    var cadenaMasLarga=""

    for(word in list ){
        if (word.length > cadenaMasLarga.length){
            cadenaMasLarga=word
        }
    }

    println("la cadena mas larga es $cadenaMasLarga")

}