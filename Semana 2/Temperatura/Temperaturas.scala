// Alumno: Pedro David Jorge Huaynalaya Montes
// Codigo: u23321591
// Fecha: 06/09/2026

import scala.io.StdIn.readInt

object Temperaturas {
    def main(args: Array[String]): Unit = {

        val temperaturas:List[Int] = List(34, 13, 6, 26, 12, 31, 13, 19)

        print("Ingrese la temperatura mínima: ")
        val minimo: Int = readInt()

        print("Ingrese la temperatura máxima: ")
        val maximo : Int = readInt()

        //llama a la funcion para revisar la temperatura
        verificarTemperatura(temperaturas, minimo, maximo)
    }

    def verificarTemperatura(lista: List[Int], minimo: Int, maximo: Int) : Unit = {
        //usamos un iterador y una variable para notificar si hay alerta de estabilidad
        val iterador = lista.iterator
        var fueraRango = false

        while(iterador.hasNext){
            val temperatura = iterador.next()

            //Usamos la condicion para imprimir la temperatura fuera de rango
            if(temperatura < minimo || temperatura > maximo){
                println("Temperatura fuera de rango: "+temperatura)
                fueraRango = true
            }
        }

        //Si cambia a true se imprime la alerta
        if(fueraRango){
            println("Alerta de estabilidad")
        }
    }
}