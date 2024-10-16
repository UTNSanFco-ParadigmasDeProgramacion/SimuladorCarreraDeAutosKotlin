class AutoDeportivo(
    nombre: String,
):VehiculoCustom(nombre = nombre,220, 80, 15, 10) {
    override fun toString (): String {
        return "El auto deportivo " + nombre + " | " + super.toString() + " | " + "Aceleracion: " + aceleracion + " | " + "Frenado: "+ frenado
    }
}