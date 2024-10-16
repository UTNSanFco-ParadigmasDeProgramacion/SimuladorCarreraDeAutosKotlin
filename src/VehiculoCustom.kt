abstract class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre = nombre, velocidadMaxima = velocidadMaxima, combustible = combustible, aceleracion = aceleracion, frenado = frenado) {
    override fun acelerar() {
        if (combustible > 0) {
            if (velocidadActual < velocidadMaxima) {
                velocidadActual += aceleracion
                combustible -= 1
            }
        }
        else {
                println("Error, falta de combustible")
            }
    }

    override fun frenar() {
        if (velocidadActual > 0) {
            velocidadActual -= frenado
            if(velocidadActual<0) {
                velocidadActual=0
            }
            println("Nueva velocidad de ${this.javaClass.simpleName}: $velocidadActual")
        }
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
    }
}