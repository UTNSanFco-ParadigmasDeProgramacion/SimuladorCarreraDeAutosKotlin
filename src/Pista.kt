import kotlin.random.Random
abstract class Pista(val longitud: Int, var clima: String) {
     abstract fun aplicarCondiciones(vehiculo: Vehiculo)
     abstract fun cambiarClima()
     abstract fun aplicarEventoAleatorio(vehiculo: Vehiculo)
     abstract fun agregarVehiculo (vehiculo: Vehiculo)
}
