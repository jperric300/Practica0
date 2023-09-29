//Tarea 1 - Comprobar si un número entero es capicúa.

fun main() {

    val resultado = esCapicua(8008)
    println(resultado)
}

fun esCapicua(num:Int){

    var numString= num.toString()
    var numInverso = numString.reversed()

    if(numString==numInverso){
        return println("el numero $num es capicua")
    }else{
        return println("el numero $num no es capicua")
    }

}