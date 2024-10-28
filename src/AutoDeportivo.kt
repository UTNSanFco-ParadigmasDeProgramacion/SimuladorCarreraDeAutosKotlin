class AutoDeportivo (
    nombre: String

): VehiculoCustom(nombre, velocidadMaxima = 220, 80.0,15,10){override fun combustibleMaximo(): Double = 80.0
}