class Persona(
    val nombre: String,
    val edad: Int,
    val correoElectronico: String
) {

    fun mostrarInfo() {
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Correo electrónico: $correoElectronico")
    }

    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }
}

fun main() {
    val persona = Persona("Juan Pérez", 29, "juanperez1995@hotmail.com")

    persona.mostrarInfo()

    if (persona.esMayorDeEdad()) {
        println("${persona.nombre} es mayor de edad.")
    } else {
        println("${persona.nombre} no es mayor de edad.")
    }
}
