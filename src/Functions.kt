//Functions without return
fun printMessage(message: String) {
    println(message)
}



//Single-expression functions
fun mult(x: Int, y: Int): Int {
    return x * y
}


//Lambda expressions
fun lambda1(message: String){
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString(message))
}

fun lambda2(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)


    val positives = numbers.filter ({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    println(negatives)
}








fun main() {
    printMessage("Funcion sin return")
    println( mult(4, 5))
    println(lambda1("Hola lambda"))
    println(lambda2())

}