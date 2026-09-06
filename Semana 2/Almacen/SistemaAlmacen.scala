// Alumno: Pedro David Jorge Huaynalaya Montes
// Codigo: u23321591
// Fecha: 06/09/2026


object SistemaAlmacen {
  def main(args: Array[String]): Unit = {
    val cantidades: List[Int] = List(13, 23, 20, 17, 28, 19)
    val umbral:Int=20
    //se llama a la funcion para calcular
    menorUmbral(cantidades, umbral) 
  }

  def menorUmbral(cantidades: List[Int],umbral: Int) : Unit = {
    //usamos forech para recorrer
    cantidades.foreach { cantidad =>
    //verifica si es menor que el umbral para imprimirlo
      if(cantidad < umbral){
      println(cantidad + " Se debe reponer")
      }
    }
  }
}