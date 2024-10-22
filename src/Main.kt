//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val moto= Moto("zanella")
    val autoDeportivo = AutoDeportivo ("corsa")
    val camion = Camion ("scania")

    println("----inicio carrera----")

    moto.acelerar()
    moto.avanzar()
    moto.frenar()
    println(moto)

    autoDeportivo.acelerar()
    autoDeportivo.avanzar()
    autoDeportivo.frenar()
    println(autoDeportivo)

    camion.acelerar()
    camion.avanzar()
    camion.frenar()
    println(camion)

    println("finalizo la carrera")
}
