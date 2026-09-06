// Alumno: Pedro David Jorge Huaynalaya Montes
// Codigo: u23321591
// Fecha: 06/09/2026

object Tienda {
    def main(args: Array[String]): Unit = {

        val productos : Map[String, Double] = Map(
            "Pelota" -> 25.0,
            "Cartera" -> 38.0,
            "Casaca" -> 50.0,
            "Pantalon" -> 90.0,
            "Camisa" -> 55.0
        )
        //Filtrar por precio mayor a 50
        val lista = productos.filter{
            case(nombre, precio) => precio > 50
        }
        //Aplicacion de descuento
        val Descuento = lista.map{
            case(nombre, precio) => (nombre, precio * 0.80)
        }
        //Se añade formato a la lista
        val ListaNueva = Descuento.map{
            case(nombre, precio) => s"Producto: $nombre | Precio Rebajado: $$${precio}"
        }.toList
        //Calculo del promedio
        val promedio = Descuento.map {
        case (nombre, precio) => precio
        }.sum / Descuento.size

        println(ListaNueva)
        println("Precio promedio: $" + promedio)
    }
}