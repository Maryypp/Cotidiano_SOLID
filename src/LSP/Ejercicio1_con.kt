package LSP1

open class objeto {
    open fun calcularArea() : Int{
        return 0
    }
}
open class Cuadrado (var lado: Int) : objeto() {
    override fun calcularArea(): Int{
        return lado * lado
    }
}
open class Rectangulo(private var ancho: Int, var altura: Int) : objeto() {
    override fun calcularArea(): Int {
        return ancho * altura
    }
}
fun main (){
    val cuadrado = Cuadrado(5)
    val rectangulo = Rectangulo(5,10)
    println("Area cuadrado: ${cuadrado.calcularArea()}")
    println("Area rectangulo: ${rectangulo.calcularArea()}")
}
