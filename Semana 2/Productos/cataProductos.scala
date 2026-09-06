// Alumno: Pedro David Jorge Huaynalaya Montes
// Codigo: u23321591
// Fecha: 06/09/2026

object cataProductos {
    def main(args: Array[String]): Unit = {

        val productos:Map[String, Double] = Map(
            "Guitarra" -> 120.0,
            "Pelota" -> 20.0,
            "Guantes" -> 10.0,
            "Casaca" -> 54.0)
        val busqueda : String = "Pelota"

        //llamada a la funcion para buscar
        buscarproducto(productos, busqueda)
    }

    def buscarproducto(lista : Map[String, Double], buscar: String) : Unit = {
        //creamos el iterador y la variable para saber si lo encontró o no
        val iterador = lista.iterator
        var encontrado = false

        //usamos un while para iterar el Map hasta encontrar el producto
        while(iterador.hasNext && !encontrado){
            val(producto, precio) = iterador.next()
            
            //Si encuentra el producto lo imprime y cambia la variable encontrado a true
            if(producto == buscar){
                println("El precio del producto "+producto+ " es de $"+precio)
                encontrado = true
            }
        }

        //Si encontrado sigue siendo false se ejecuta, de lo contrario, no
        if(!encontrado){
            println("Producto no encontrado en el catalogo actual")
        }
    }
}