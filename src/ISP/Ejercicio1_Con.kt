package ISP

interface Encendible {
    fun encender()
    fun apagar()
}
interface Conectar{
    fun conectarWifi()
}
interface Actualizar{
    fun actualizarFirmware()
    }
class Lampara : Encendible {
    override fun encender() {
        println("Encendiendo la lampara")
    }
    override fun apagar() {
        println("Apagando la lampara")
    }
}
fun main () {
    val lampara: Encendible = Lampara()
    lampara.encender()
    lampara.apagar()
}