package OCP1

interface Protocolo {
    fun ejecutar(archivo: String)
}

class FTP : Protocolo {
    override fun ejecutar(archivo: String) = println("Enviando archivo por FTP: $archivo")
}

class HTTP : Protocolo {
    override fun ejecutar(archivo: String) = println("Enviando archivo por HTTP: $archivo")
}

class EnvioArchivos {
    fun enviar(protocolo: Protocolo, archivo: String) = protocolo.ejecutar(archivo)
}

fun main() {
    val envio = EnvioArchivos()
    envio.enviar(FTP(), "documento1.txt")
    envio.enviar(HTTP(), "documento2.txt")


}