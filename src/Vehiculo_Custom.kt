class Vehiculo_Custom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre = nombre, velocidadMaxima = velocidadMaxima, combustible = combustible, aceleracion = aceleracion, frenado = frenado) {
    override fun acelerar(){
        if(combustible>0) {
            if (velocidadActual<velocidadMaxima) {
                velocidadActual += aceleracion
                combustible -= 1
                acelerar()
            }
            else {
                printf("")
            }
        }
    }
}