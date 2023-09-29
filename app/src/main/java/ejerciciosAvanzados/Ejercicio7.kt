

//Tarea 7 - Piedra, Papel, Tijera, Lagarto, Spock
//Crea un programa que calcule quien gana más partidas
//- El resultado puede ser: "P1", "P2", "X"
//- La función recibe un listado de jugada.

//Ejemplo: [(Piedra vs Papel), (Tijera vs Papel), (Papel vs Tijera)] = P2



fun main() {
    val opciones = listOf("Piedra", "Papel", "Tijeras", "Lagarto", "Spock")

    val partidas = listOf(
        Pair("Piedra", "Papel"),
        Pair("Tijeras", "Papel"),
        Pair("Papel", "Tijeras")
    )


    val reglas = mapOf(
        "Piedra" to listOf("Tijeras", "Lagarto"),
        "Papel" to listOf("Piedra", "Spock"),
        "Tijeras" to listOf("Papel", "Lagarto"),
        "Lagarto" to listOf("Spock", "Papel"),
        "Spock" to listOf("Tijeras", "Piedra")
    )

    var puntuacionP1 = 0
    var puntuacionP2 = 0



    for (partida in partidas) {
        val jugadaP1 = partida.first
        val jugadaP2 = partida.second

        if (jugadaP1 == jugadaP2) {
            println("Empate en $jugadaP1 vs $jugadaP2")
        } else if (jugadaP2 in reglas[jugadaP1] ?: emptyList()) {
            println("$jugadaP1 gana a $jugadaP2")
            puntuacionP1++
        } else {
            println("$jugadaP2 gana a $jugadaP1")
            puntuacionP2++
        }
    }

    println("Puntuación final: P1 - $puntuacionP1, P2 - $puntuacionP2")

    val resultado = when {
        puntuacionP1 > puntuacionP2 -> "P1"
        puntuacionP2 > puntuacionP1 -> "P2"
        else -> "Empate"
    }

    println("El ganador es: $resultado")
}