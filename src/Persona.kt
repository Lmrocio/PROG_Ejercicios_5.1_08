open class Persona(val nombre: String,
                   private val fechaNac: String) {

    val edad: Int
        get() {
            val anioNacimiento = fechaNac.split("-")[0].toInt()
            val anioActual = 2025
            return anioActual - anioNacimiento
        }

    fun cumple(){}

    open fun actividad(){
        println("$nombre está realizando una actividad.")
    }

    override fun toString(): String {
        return "${this::class.simpleName} (nombre = $nombre, edad = $edad)"
    }
}