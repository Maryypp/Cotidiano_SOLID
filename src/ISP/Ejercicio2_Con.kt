package ISP

interface Trabajador {
    fun trabajar()
}
interface Administrador {
    fun administrar()
}
interface Auditador {
    fun auditador()
}
class Desarrollador : Trabajador {
    override fun trabajar() {
        println("Desarrollando software...")
    }
}
fun main (){
    val desarrollador = Desarrollador()
    desarrollador.trabajar()
}