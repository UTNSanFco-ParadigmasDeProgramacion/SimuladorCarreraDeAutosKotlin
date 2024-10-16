
fun main() {
    var moto1 = Moto("NicoteHD")
    moto1.acelerar()
    println(moto1.toString())
    moto1.frenar()

    var auto1 = AutoDeportivo("Jose")
    auto1.acelerar()
    auto1.frenar()
    auto1.toString()
    println(auto1.toString())

    var camion1 = Camion("Ulises")
    println(camion1.toString())
    camion1.acelerar()
    camion1.avanzar()

    println(camion1.toString())

}
