//Tarea 5 - Transformar una cadena de caracteres a lenguage hacker:
fun main() {
    val cadenaOriginal = "HELLO"
    val cadenaTransformada = reemplazarCaracteres(cadenaOriginal)
    println(cadenaTransformada)
}

fun reemplazarCaracteres(cadena: String):String {
    var cadenaTransformada = cadena.replace("A", "4")
    cadenaTransformada = cadenaTransformada.replace("B", "I3")
    cadenaTransformada = cadenaTransformada.replace("C", "[")
    cadenaTransformada = cadenaTransformada.replace("D", ")")
    cadenaTransformada = cadenaTransformada.replace("E", "&")
    cadenaTransformada = cadenaTransformada.replace("F", "|=")
    cadenaTransformada = cadenaTransformada.replace("G", "&")
    cadenaTransformada = cadenaTransformada.replace("H", "#")
    cadenaTransformada = cadenaTransformada.replace("I", "1")
    cadenaTransformada = cadenaTransformada.replace("J", ",_|")
    cadenaTransformada = cadenaTransformada.replace("K", ">|")
    cadenaTransformada = cadenaTransformada.replace("L", "£")
    cadenaTransformada = cadenaTransformada.replace("M", "JVI")
    cadenaTransformada = cadenaTransformada.replace("N", "^/")
    cadenaTransformada = cadenaTransformada.replace("O", "0")
    cadenaTransformada = cadenaTransformada.replace("P", "|*")
    cadenaTransformada = cadenaTransformada.replace("Q", "(_,)")
    cadenaTransformada = cadenaTransformada.replace("R", "I2")
    cadenaTransformada = cadenaTransformada.replace("S", "5")
    cadenaTransformada = cadenaTransformada.replace("T", "7")
    cadenaTransformada = cadenaTransformada.replace("U", "(_)")
    cadenaTransformada = cadenaTransformada.replace("V", "|/")
    cadenaTransformada = cadenaTransformada.replace("W", "VV")
    cadenaTransformada = cadenaTransformada.replace("X", "><")
    cadenaTransformada = cadenaTransformada.replace("Y", "j")
    cadenaTransformada = cadenaTransformada.replace("Z", "2")
    cadenaTransformada = cadenaTransformada.replace("1", "L")
    cadenaTransformada = cadenaTransformada.replace("2", "R")
    cadenaTransformada = cadenaTransformada.replace("3", "E")
    cadenaTransformada = cadenaTransformada.replace("4", "A")
    cadenaTransformada = cadenaTransformada.replace("5", "S")
    cadenaTransformada = cadenaTransformada.replace("6", "b")
    cadenaTransformada = cadenaTransformada.replace("7", "T")
    cadenaTransformada = cadenaTransformada.replace("8", "B")
    cadenaTransformada = cadenaTransformada.replace("9", "g")
    cadenaTransformada = cadenaTransformada.replace("0", "o")





    return cadenaTransformada
}