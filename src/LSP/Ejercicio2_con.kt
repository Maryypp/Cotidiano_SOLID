package LSP2

open class Dispositivo
open class DispositivoEncendible: Dispositivo(){
    open fun encender() {
        println("Encendiendo dispositivo...")
    }
}
class Televisor: DispositivoEncendible()
class Radio: Dispositivo()

fun main(){
    val dispositivoEncendible = DispositivoEncendible()
    dispositivoEncendible.encender()
}

