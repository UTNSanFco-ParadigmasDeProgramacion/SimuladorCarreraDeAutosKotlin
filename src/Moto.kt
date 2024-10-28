class Moto (nombre: String): VehiculoCustom (nombre, velocidadMaxima = 180, combustible = 60.0, aceleracion = 20, frenado = 15){
    override fun combustibleMaximo(): Double = 60.0


}