import kotlin.random.Random

class Carrera(
    val distancia: Int,
    var listaVehiculo: ArrayList<Vehiculo> = arrayListOf(),
) {
    fun agregarVehiculo(vehiculo: Vehiculo) {
        listaVehiculo.add(vehiculo)
    }

    fun carrera() {
        var pistaPersonalizada = PistaPersonalizadaFacundoJoseSereno()
        var vehiculoGanador: Vehiculo? = null
        while (vehiculoGanador == null && listaVehiculo.isNotEmpty()) {
            for (i in listaVehiculo.toList()) {
                if (i.distanciaRecorrida < distancia) {
                    val accion = listOf("avanzar", "frenar", "acelarar").random()
                    val pistaRandom = listOf("aplicarCondiciones", "cambiarClima", "aplicarEventoAleatorio").random()


                    when(accion){
                        "avanzar" -> {
                            i.avanzar()
                        }
                        "frenar" -> {
                            i.frenar()
                        }
                        "acelarar" -> {
                            i.acelerar()
                        }
                    }

                    when(pistaRandom) {
                        "aplicarCondiciones" -> pistaPersonalizada.aplicarCondiciones(i)
                        "cambiarClima" -> pistaPersonalizada.cambiarClima()
                        "aplicarEventoAleatorio" -> pistaPersonalizada.aplicarEventoAleatorio(i)
                    }

                    if (i.velocidadActual == 0.0 && listaVehiculo.isNotEmpty()) {
                        listaVehiculo.remove(i)
                    }

                    if (i.distanciaRecorrida >= distancia) {
                        vehiculoGanador = i
                        break
                    }
                }
            }
        }
        if (vehiculoGanador == null) {
            println("No hay ganadores")
        }
        else {
            println("El vehiculo ganador es ${vehiculoGanador}")
        }
    }
}