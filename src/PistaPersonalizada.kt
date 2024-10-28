import kotlin.random.Random
open class PistaPersonalizada (nombreEquipo: String, longitud: Int) : Pista(longitud, "normal") {

    override fun agregarVehiculo(vehiculo: Vehiculo) {

    }
    override fun aplicarCondiciones(vehiculo: Vehiculo) {
    when (clima) {
        "lluvia" -> vehiculo.reducirVelocidad(0.5)
        "niebla" -> vehiculo.reducirVelocidad(0.2)
        "soleado" -> vehiculo.incrementarConsumo()
        else -> println("Clima normal, sin afectaciones a ${vehiculo.nombre}.")
    }
}

override fun cambiarClima() {
    val climas = listOf("soleado", "lluvia", "niebla", "normal")
    clima = climas[Random.nextInt(climas.size)]
    println("El clima ha cambiado a: $clima")
}

    override fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
    val eventos = listOf("pinchazo", "fallo mecanico", "encontrar combustible", "sin evento")
    val evento = eventos[Random.nextInt(eventos.size)]

    when (evento) {
        "pinchazo" -> vehiculo.frenar()
        "fallo mecanico" -> vehiculo.detener()
        "encontrar combustible" -> vehiculo.incrementarCombustible()
        else -> println("No ocurrió ningún evento con ${vehiculo.nombre}.")
    }
}
}