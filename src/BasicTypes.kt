fun basic_types(){

    //Strings & Mutabilidad
    var mutableString: String = "Adam"
    val immutableString: String = "Adam"
    val inferredString = "Adam"

    println(mutableString)
    println(immutableString)
    println(inferredString)

    //tipos de intengers
    val intNum = 10
    val doubleNum = 10.0
    val longNum = 10L
    val floatNum = 10.0F

    println(intNum)
    println(doubleNum)
    println(longNum)
    println(floatNum)



    //Boolean
    val isDisponible: Boolean = true
    println(isDisponible)
}
fun main(){
    basic_types()
}