fun crearPersona(nombre: String, fechaNac: String): Persona? {
    if (nombre.isEmpty()) {
        println("Error: El nombre no puede estar vacío.")
        return null
    }

    if (fechaNac.split("-").size != 3 || fechaNac.split("-")[0].toInt() > 2025) {
        println("Error: Fecha de nacimiento no válida.")
        return null
    }

    return Persona(nombre, fechaNac)
}

fun main() {

    val persona = Persona("Fran", "1994-06-09")
    println(persona)
    persona.cumple()
    println(persona)

    val estudiante = Estudiante("Pedro", "1999-02-03", "Ingeniería Informática")
    println(estudiante)
    persona.actividad()
    estudiante.actividad()


    val personaInv = crearPersona("Diego", "2025-03-15")
    println(personaInv)
}