class Moto(    nombre: String,
):VehiculoCustom(nombre = nombre,180, 60.0, 20, 15, 1.0) {
    override fun toString (): String {
        return "La moto " + nombre + " | " + super.toString() + " | " + "Aceleracion: " + aceleracion + "km/s² | " + "Frenado: "+ frenado + "km/s²"
    }

    /* override fun frenar() {
        print("La Moto: ")
        super.frenar()
    } igual que ${this.javaClass.simpleName} pero con override fun */
}