import scala.io.StdIn.readInt
import scala.math._

object Prueba {
  def llenarVector(tamanio : Int) : Array[Double] = {
    var datos = new Array[Double](tamanio)
    for(i <- 0 to (tamanio - 1)){
      println("Ingresa el dato numero: "  + (i+1))
      datos(i) = readInt()
    }
    return datos
  }

  def vaciarVector(v: Array[Double]) : Unit={
    for(elemento <- v){
      print(elemento + " , ")
    }
  }

  def encontrarMedia(v : Array[Double]): Double = {
    var media : Double = 0
    for(i <- v){
      media = (media + i)
    }
    media = media/v.length

    return media
  }

  def encontrarDesviacionEstandar(u : Double, v :Array[Double]) : Double = {
    var x : Double = 0
    for(i <- v){
      x = x + pow((i - u), 2)
    }

    x = x / v.length
    x = sqrt(x)
    return x
  }



  def main(args: Array[String]): Unit = {
    println("Ingresa cual sera la cantidad de numeros a ingresar:")
    var t = readInt()
    println("Entrontrar la media de los siguientes datos...")
    //vaciarVector(llenarVector(t))
    var vector = llenarVector(t)
    println("La media seria: " + encontrarMedia(vector))

    println("La desviacion estandar es: " + encontrarDesviacionEstandar(encontrarMedia(vector), vector))
  }
}
