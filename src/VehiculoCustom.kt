

abstract class VehiculoCustom (
    nombre: String,
    velocidadMaxima: Int,
    combustible: Double,
    aceleracion: Int,
    frenado: Int,


): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado){
 private var factorConsumo:Double = 1.00
    override fun acelerar(){
        if (combustible > 0){
            combustible -= (1 * factorConsumo)
                  velocidadActual += aceleracion
              if (velocidadActual < velocidadMaxima){
                  println("$nombre esta acelerando... velocidad actual: $velocidadActual km/h , combustible restante: $combustible")
              } else {
                  velocidadActual= velocidadMaxima
                  println("$nombre llego a la velocidad máxima que es $velocidadActual km/h,combustible restante: $combustible" )




          }

        } else {
            println("$nombre no tiene combustible y se detuvo")
            velocidadActual=0
        }

    }

    override fun frenar() {
        if (velocidadActual >= frenado)
        {
            velocidadActual -= frenado
            println("$nombre freno, la velocidad actual es $velocidadActual km/h")

        }
    }

    override fun avanzar() {

        distanciaRecorrida += velocidadActual
        println("$nombre avanzó, la distancia recorrida es $distanciaRecorrida km.")
    }

    override fun toString(): String {
        return super.toString() + ",nombre: $nombre, vel maz $velocidadMaxima, aceleracion $aceleracion, frenado : $frenado"
    }


    override fun detener (){
        velocidadActual=0
        println("$nombre se detuvo por un fallo mecanico")
    }


   abstract override fun combustibleMaximo():Double

    override fun incrementarCombustible() {
        val incremento = (combustible*0.20)
        combustible+=incremento
        println("se incremento el combustible en $incremento unidades")
        if (combustibleMaximo() < combustible){
            combustible = combustibleMaximo()
        }
    }

    override fun incrementarConsumo() {
        factorConsumo=1.25
    }
    override fun reducirVelocidad(factor:Double) {
        velocidadActual= (velocidadActual* factor).toInt()
    }


}

