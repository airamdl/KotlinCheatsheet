

fun esPositivo(x:Int){

    //if se usa cuando necesitas hacer una comparación simple para decidir entre dos o mas acciones.
    if (x>=0) {
        println("El numero dado es positivo")
    } else {
        println("El numero dado es negativo")
    }

}

// When es útil cuando necesitas comparar un valor con varias opciones posibles.
fun whenuse(){
    fun diaSemana(dia: Int) {
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miércoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sábado")
            7 -> println("Domingo")
            else -> println("Día no válido")
        }

    }
    diaSemana(3)
    diaSemana(6)

}

//For se usa para recorrer una secuencia (como una lista, un rango o un array) y realizar una acción repetida para cada elemento.
fun imprimirNumeros() {
    for (i in 1..5) {
        println(i)
    }
}


//While Cuando necesitas ejecutar un bloque de código repetidamente mientras se cumpla una condición
fun contarConWhile(x:Int) {
    var i = 1
    while (i <= x) {
        println(i)
        i++
    }
}





fun main() {
    esPositivo(5)
    esPositivo(-5)
    whenuse()
    imprimirNumeros()
    contarConWhile(15)

}