
// Tarea 8 - Escribir una función que muestre los números del 1 al 100, sustituyendo:

   //Múltiplos de 3 por la palabra "triple".
   //Múltiplos de 5 por la palabra "premio".
   //Múltplos de 3 y 5 a la vez por "triplepremio".


fun main() {
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("tripleno")
            i % 3 == 0 -> println("triple")
            i % 5 == 0 -> println("premio")
            else -> println(i)
        }
    }
}