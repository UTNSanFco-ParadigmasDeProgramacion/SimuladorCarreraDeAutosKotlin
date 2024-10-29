class AutoDeportivo(
    nombre: String,
):VehiculoCustom(nombre = nombre,220, 80.0, 15, 10, 1.0) {
    override fun toString (): String {
        return "El auto deportivo " + nombre + " | " + super.toString() + " | " + "Aceleracion: " + aceleracion + "km/s² | " + "Frenado: "+ frenado + "km/s²"
    }
}