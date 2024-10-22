class Camion(nombre: String,
             velocidadMaxima: Int,
             combustible: Int,
             aceleracion: Int,
             frenado: Int):
    VehiculoCustom(nombre, velocidadMaxima, combustible, aceleracion, frenado)

{
    override fun toString(): String {
        return "Nombre: $nombre, Velocidad máxima: $velocidadMaxima , Combustible: $combustible , Aceleración: $aceleracion , frenado: $frenado"
    }
}