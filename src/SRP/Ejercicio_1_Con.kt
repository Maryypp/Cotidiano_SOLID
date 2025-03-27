package SRP_Con


class Producto(val nombre: String, val precio: Double)

class ProductoCalculo{
    fun calcularDescuento(producto: Producto,porcentaje: Double): Double{
        return producto.precio - (producto.precio * porcentaje / 100)
    }

    class ProductoImprimir{
        fun imprimirDetalles(producto: Producto){
            println("Producto: ${producto.nombre}, Precio: ${producto.precio}")
        }
    }

}
fun main(){
    val producto = Producto("Helado", 5.5)
    val calculo = ProductoCalculo()
    val imprimir = ProductoCalculo.ProductoImprimir()

    println("Precio con descuento:${calculo.calcularDescuento(producto, 10.0)}")
    imprimir.imprimirDetalles(producto)
    calculo.calcularDescuento(producto, 5.0)
}
