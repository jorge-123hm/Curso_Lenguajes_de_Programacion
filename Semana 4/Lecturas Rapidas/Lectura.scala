// Alumno: Pedro David Jorge Huaynalaya Montes
// Codigo: u23321591
// Fecha: 06/09/2026

object Lectura {
    def main(args: Array[String]): Unit = {
        //Objeto libro
        case class Libro(titulo:String, autor:String, paginas:Int)

        val lista = List(
            Libro("El poema","Jose Maduro",120),
            Libro("Leyendas","Pedro Marquez",78),
            Libro("Cuentos extraordinarios","Manuel Olaya",210),
            Libro("El equilibrio","Daniel Zapata",223)
        )

        //filtra los libros con menos de 200 paginas
        val cortos = lista.filter(_.paginas < 200)
        //Extrae lo titulos y con convierte a mayusculas
        val tituloMayuscula = cortos.map(_.titulo.toUpperCase)
        //Agrega el prefijo LECTURA CORTA
        val titulosPrefijo = tituloMayuscula.map(p => s"LECTURA CORTA: $p")
        //Obtiene la longitud de cada elemento de la lista y los suma 
        val totalCaracteres = titulosPrefijo.map(_.length).sum
        println(titulosPrefijo)
        println("Total caracteres: " + totalCaracteres)
    }
}