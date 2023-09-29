//Tarea 6 - Retornar una cadena de caracteres dada invertida y con efecto espejo desde el último carácter.


fun main() {
    val cadenaOriginal = "Android"
    val cadenaInvertida = cadenaOriginal.reversed().drop(1)

    print("$cadenaOriginal$cadenaInvertida")

}