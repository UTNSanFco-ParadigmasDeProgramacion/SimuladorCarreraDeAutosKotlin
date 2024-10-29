abstract class Vehiculo(
    val nombre: String,
    val velocidadMaxima: Int,
    var combustible: Double,
    val aceleracion: Int,
    val frenado: Int,
    var consumo: Double = 1.0,
) {
    // region Properties
    var velocidadActual: Double = 0.0
    var distanciaRecorrida: Double = 0.0
    // endregion

    // region Abstract function
    abstract fun acelerar()
    abstract fun frenar()
    abstract fun avanzar()
    // endregion

    override fun toString(): String {
        return "Velocidad: $velocidadActual km/h | Combustible: $combustible l | Distancia: $distanciaRecorrida m"
    }
}