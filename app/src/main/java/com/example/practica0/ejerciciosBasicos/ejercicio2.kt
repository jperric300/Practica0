
//Tarea 2 - Calcular media, moda y mediana de un listado de números.
fun main() {
    val listaDeNumeros = listOf(2, 4, 4, 6, 8, 8, 8, 10)

    val media = calcularMedia(listaDeNumeros)
    val moda = calcularModa(listaDeNumeros)
    val mediana = calcularMediana(listaDeNumeros)

    println("Media: $media")
    println("Moda: $moda")
    println("Mediana: $mediana")
}


fun calcularMedia(numeros: List<Int>): Double {
    val suma = numeros.sum()
    return suma.toDouble() / numeros.size
}


fun calcularModa(numeros: List<Int>): List<Int> {
    val conteo = mutableMapOf<Int, Int>()


    for (numero in numeros) {
        conteo[numero] = conteo.getOrDefault(numero, 0) + 1
    }


    val modaFrecuenciaMaxima = conteo.values.maxOrNull()

    val modas = mutableListOf<Int>()


    for (entry in conteo.entries) {
        if (entry.value == modaFrecuenciaMaxima) {
            modas.add(entry.key)
        }
    }

    return modas
}


fun calcularMediana(numeros: List<Int>): Double {
    val numerosOrdenados = numeros.sorted()

    val n = numerosOrdenados.size
    return if (n % 2 == 0) {
        val mitad1 = numerosOrdenados[(n / 2) - 1]
        val mitad2 = numerosOrdenados[n / 2]
        (mitad1 + mitad2) / 2.0
    } else {
        numerosOrdenados[n / 2].toDouble()
    }
}