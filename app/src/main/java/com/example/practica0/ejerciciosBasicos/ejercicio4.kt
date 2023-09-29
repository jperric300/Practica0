//Tarea 4 - Mostrar la sucesión de fibonacci hasta el número entero dado.


fun main() {

    val numeroDado = 100

    var valor1 = 0
    var valor2 = 1

    while(valor1 <= numeroDado){
        println("$valor1")
        val siguienteNumero= valor1+valor2
        valor1=valor2
        valor2 = siguienteNumero
    }

}