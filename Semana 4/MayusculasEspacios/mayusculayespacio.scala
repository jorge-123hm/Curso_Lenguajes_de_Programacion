// Alumno: Pedro David Jorge Huaynalaya Montes
// Codigo: u23321591
// Fecha: 06/09/2026

object mayusculayespacio {
    def main(args: Array[String]): Unit = {

        val hashtags: Set[String] = Set(
            " Scala ",
            "scala",
            "PROGRAMACION",
            " programación ",
            "python ",
            " PyThon",
            "AI",
            "a",
            "Java"
        )

        val hashtagsNuevos = hashtags
        .map(_.trim)
        .map(_.toLowerCase)
        .filter(_.length >= 3)

        val resultado = hashtagsNuevos.mkString(", ")

        println(resultado)
    }
}