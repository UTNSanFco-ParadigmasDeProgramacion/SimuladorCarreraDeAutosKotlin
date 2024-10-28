abstract class Vehiculo(
    val nombre: String,
    val velocidadMaxima: Int,
    var combustible: Double,
    val aceleracion: Int,
    val frenado: Int,
) {
    // region Properties
    var velocidadActual: Int = 0
    var distanciaRecorrida: Int = 0
    // endregion
//
    // region Abstract function
    abstract fun acelerar()
    abstract fun frenar()
    abstract fun avanzar()
    abstract fun detener ()
    abstract fun incrementarCombustible()
    abstract fun combustibleMaximo ():Double
    abstract fun reducirVelocidad (factor:Double)
    abstract fun incrementarConsumo ()
    // endregion

    override fun toString(): String {
        return "Velocidad: $velocidadActual km/h | Combustible: $combustible | Distancia: $distanciaRecorrida m"
    }
}
