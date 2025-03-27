package OCP2

interface Grafica {
    fun ejecutar(tipo: String)
}

class Barras : Grafica {
    override fun ejecutar(tipo: String) = println("Dibujando grafica: ${tipo}")
    }
class Lineas : Grafica {
    override fun ejecutar(tipo: String) = println("Dibujando grafica: ${tipo}")
    }

class Grafico {
    fun dibujar(grafica: Grafica, tipo: String) = grafica.ejecutar(tipo)
}

fun main(){
    val grafica = Grafico()
    grafica.dibujar(Barras(), "Barras")
    grafica.dibujar(Lineas(), "Lineas")

}