class Moto(    nombre: String,
):VehiculoCustom(nombre = nombre,180, 60, 20, 15) {
    override fun toString (): String {
        return "La moto " + nombre + " | " + super.toString() + " | " + "Aceleracion: " + aceleracion + " | " + "Frenado: "+ frenado
    }
}