open class VehiculoCustom (
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,


): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado){

    override fun acelerar(){
        if (combustible > 0){
          while (combustible > 0 )
          {
              combustible -= 1
                  velocidadActual= (velocidadActual + aceleracion)
              if (velocidadActual < velocidadMaxima){
                  println("$nombre esta acelerando... velocidad actual: $velocidadActual km/h , combustible restante: $combustible")
              } else {
                  velocidadActual= velocidadMaxima
                  println("$nombre llego a la velocidad máxima que es $velocidadActual km/h,combustible restante: $combustible" )
              }



          }
          println("$nombre se quedo sin combustible y se detuvo")
        } else {
            println("$nombre no tiene combustible")
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
        println("$nombre avanzo, la distancia recorrida es $distanciaRecorrida km ")
    }

    override fun toString(): String {
        return super.toString() + ",nombre: $nombre, vel maz $velocidadMaxima, aceleracion $aceleracion, frenado : $frenado"
    }
}

