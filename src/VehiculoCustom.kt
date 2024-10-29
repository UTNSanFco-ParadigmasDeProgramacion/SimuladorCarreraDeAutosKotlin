abstract class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Double,
    aceleracion: Int,
    frenado: Int,
    consumo: Double,
): Vehiculo(nombre = nombre, velocidadMaxima = velocidadMaxima, combustible = combustible, aceleracion = aceleracion, frenado = frenado, consumo = consumo) {
    override fun acelerar() {
        if (combustible > 0) {
            if (velocidadActual < velocidadMaxima) {
                velocidadActual += aceleracion
                combustible -= consumo
            }
        }
        else {
                println("Error, falta de combustible")
            }
    }

    override fun frenar() {
        if (velocidadActual > 0) {
            velocidadActual -= frenado
            if(velocidadActual < 0) {
                velocidadActual = 0.0
            }
            println("Nueva velocidad de ${this.javaClass.simpleName} $nombre: $velocidadActual km/h")
        }
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
    }
}