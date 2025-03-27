package SRP_CON

class Cliente(val nombre: String, val edad: Int)

class Save(){
    fun guardarCliente(cliente: Cliente){
    println("Guardando usuario: ${cliente.nombre} ")
    }
}

class mail(){
    fun EnviarCorreo(cliente: Cliente){
        println("Enviando correo a: ${cliente.nombre} ")
    }
}

fun main() {
    val cliente = Cliente("Gumball", 12)
    val Ccliente = Save()
    val correo = mail()
    Ccliente.guardarCliente(cliente)
    correo.EnviarCorreo(cliente)
}