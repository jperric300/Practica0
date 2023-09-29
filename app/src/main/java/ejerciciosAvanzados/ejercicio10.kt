fun main() {
    val numeroDeseado = 6

    val conjuntoNumeros = encontrarConjuntoNumeros(numeroDeseado, 1)

    if (conjuntoNumeros.isNotEmpty()) {
        println("El numero es: $numeroDeseado")
        println("nos hacen falta ${conjuntoNumeros.size} cartas, las cuales son:")

        println(conjuntoNumeros.joinToString(", "))

    } else {
        println("No se encontró ningún conjunto de números que sumen $numeroDeseado.")
    }
}

fun encontrarConjuntoNumeros(objetivo: Int, numeroInicio: Int): Set<Int> {
    val conjuntoNumeros = mutableSetOf<Int>()

    if (objetivo == 0) {
        return conjuntoNumeros
    }

    for (i in numeroInicio until objetivo + 1) {
        if (i == objetivo) {
            conjuntoNumeros.add(i)
            return conjuntoNumeros
        } else if (i < objetivo) {
            val subconjunto = encontrarConjuntoNumeros(objetivo - i, i + 1)
            if (subconjunto.isNotEmpty()) {
                conjuntoNumeros.add(i)
                conjuntoNumeros.addAll(subconjunto)
                return conjuntoNumeros
            }
        }
    }

    return conjuntoNumeros
}