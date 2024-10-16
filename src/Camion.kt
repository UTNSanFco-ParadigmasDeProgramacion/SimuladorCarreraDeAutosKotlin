class Camion(
    nombre: String,
):VehiculoCustom(nombre = nombre,90, 150, 5, 8) {
    override fun toString (): String {
        return "EL camion " + nombre + " | " + super.toString() + " | " + "Aceleracion: " + aceleracion + "km/s² | " + "Frenado: "+ frenado + "km/s²"
    }
}