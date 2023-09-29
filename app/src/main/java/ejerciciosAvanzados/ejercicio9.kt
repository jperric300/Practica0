
//Tarea 9 - El partido de tenis
//
//    Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
//    El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
//    gane cada punto del juego.
//    - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
//    - Se deben controlar errores en la entrada de datos.
//    - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
//    15 - Love
//    30 - Love
//    30 - 15
//    30 - 30
//    40 - 30
//    Deuce
//    Ventaja P1
//    Ha ganado el P1

fun main() {
    val scoreMap = mapOf(0 to "Love", 1 to "15", 2 to "30", 3 to "40")
    val secuencia = listOf("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1")

    var puntuacionP1 = 0
    var puntuacionP2 = 0


    for (jugada in secuencia) {
        if (jugada == "P1") {
            puntuacionP1++
        } else if (jugada == "P2") {
            puntuacionP2++
        } else {
            println("Entrada no válida: $jugada")
            return
        }

        val puntuacionActualP1 = scoreMap.getOrDefault(puntuacionP1, "40")
        val puntuacionActualP2 = scoreMap.getOrDefault(puntuacionP2, "40")

        println("$puntuacionActualP1 - $puntuacionActualP2")

        if (puntuacionP1 >= 3 && puntuacionP2 >= 3) {
            if (puntuacionP1 == puntuacionP2) {
                println("Deuce")
            } else {
                val ventaja = if (puntuacionP1 > puntuacionP2) "P1" else "P2"
                println("Ventaja $ventaja")
            }
        }

        if (puntuacionP1 >= 4 && puntuacionP1 - puntuacionP2 >= 2) {
            println("Ha ganado el P1")
            return
        } else if (puntuacionP2 >= 4 && puntuacionP2 - puntuacionP1 >= 2) {
            println("Ha ganado el P2")
            return
        }
    }
}