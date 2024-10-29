
fun main() {
    var moto1 = Moto("NicoteHD")
    var moto2 = Moto("Felipe")
    var moto3 = Moto("Jeremias")

    var auto1 = AutoDeportivo("Jose")
    var auto2 = AutoDeportivo("Matias")
    var auto3 = AutoDeportivo("Facundo")

    var camion1 = Camion("Ulises")
    var camion2 = Camion("Juan")
    var camion3 = Camion("Pepito")

    /*
    moto1.acelerar()
    println(moto1.toString())

    auto1.acelerar()
    auto1.frenar()
    auto1.toString()
    println(auto1.toString())

    println(camion1.toString())
    camion1.acelerar()
    camion1.avanzar()

    println(camion1.toString())

    var pistaCustom = PistaPersonalizadaFacundoJoseSereno()
    pistaCustom.aplicarCondiciones(moto1)
    pistaCustom.aplicarCondiciones(moto2)
    pistaCustom.aplicarCondiciones(moto3)
    pistaCustom.aplicarCondiciones(auto1)
    pistaCustom.aplicarCondiciones(auto2)
    pistaCustom.aplicarCondiciones(auto3)
    pistaCustom.aplicarCondiciones(camion1)
    pistaCustom.aplicarCondiciones(camion2)
    pistaCustom.aplicarCondiciones(camion3)

    pistaCustom.cambiarClima()

    pistaCustom.aplicarCondiciones(moto1)
    pistaCustom.aplicarCondiciones(moto2)
    pistaCustom.aplicarCondiciones(moto3)
    pistaCustom.aplicarCondiciones(auto1)
    pistaCustom.aplicarCondiciones(auto2)
    pistaCustom.aplicarCondiciones(auto3)
    pistaCustom.aplicarCondiciones(camion1)
    pistaCustom.aplicarCondiciones(camion2)
    pistaCustom.aplicarCondiciones(camion3)

    pistaCustom.aplicarEventoAleatorio(moto1)
    pistaCustom.aplicarEventoAleatorio(moto2)
    pistaCustom.aplicarEventoAleatorio(moto3)
    pistaCustom.aplicarEventoAleatorio(auto1)
    pistaCustom.aplicarEventoAleatorio(auto2)
    pistaCustom.aplicarEventoAleatorio(auto3)
    pistaCustom.aplicarEventoAleatorio(camion1)
    pistaCustom.aplicarEventoAleatorio(camion2)
    pistaCustom.aplicarEventoAleatorio(camion3)
    */
    var carrera = Carrera(30)
    carrera.agregarVehiculo(moto1)
    carrera.agregarVehiculo(moto2)
    carrera.agregarVehiculo(moto3)
    carrera.agregarVehiculo(auto1)
    carrera.agregarVehiculo(auto2)
    carrera.agregarVehiculo(auto3)
    carrera.agregarVehiculo(camion1)
    carrera.agregarVehiculo(camion2)
    carrera.agregarVehiculo(camion3)

    carrera.carrera()

}
