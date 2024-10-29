import kotlin.random.Random

class PistaPersonalizadaFacundoJoseSereno(
    var clima: String = "soleado", /* Valor default para no tener que pasarlo */
    val listaDeClimas: List<String> = listOf("soleado", "lluvia", "niebla", "normal"),
    var eventoAleatorio: List<String> = listOf("pinchazo", "fallo macanico", "encontrar combustible"),
) {
    fun aplicarCondiciones(vehiculo: Vehiculo) {
        when (clima) {
            "lluvia" -> vehiculo.velocidadActual -= vehiculo.velocidadActual * 0.5
            "niebla" -> vehiculo.velocidadActual -= vehiculo.velocidadActual * 0.8
            "soleado" -> vehiculo.consumo -= vehiculo.combustible * 0.05
        }
    }

    fun cambiarClima() {
        clima = listaDeClimas.random()
        println("Nuevo clima: $clima")
    }

    fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        var resto: Double = (100 - vehiculo.combustible)
        var evento = eventoAleatorio.random()
        println("Al vehiculo ${vehiculo.nombre} le sucedio: $evento")
        when(evento) {
            "pinchazo" -> vehiculo.frenar()
            "fallo mecanico" -> { vehiculo.velocidadActual = 0.0
                println("El vehiculo se freno")
            }
            "encontrar combustible" -> {
                if (vehiculo.combustible < 80) {
                    vehiculo.combustible += 20
                } else {
                    vehiculo.combustible += resto
                }
                println("Nuevo combustible para el vehiculo ${vehiculo.nombre} es ${vehiculo.combustible} L")
            }
        }
    }
}
