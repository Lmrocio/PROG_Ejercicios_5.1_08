class Estudiante(
    nombre: String,
    fechaNac: String,
    val carrera: String
) : Persona(nombre, fechaNac) {

    override fun toString(): String {
        return "${super.toString()}, carrera = $carrera"
    }

    override fun actividad() {
        println("$nombre está estudiando para su carrera en $carrera.")
    }
}