package DIP1

interface MensajeService {
    fun enviarMensaje(mensaje: String)
}

class EmailService : MensajeService {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: ${mensaje}")
    }
}
class SMSServico : MensajeService {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando sms: ${mensaje}")
    }

    class Notificador(private val servicio: MensajeService) {
        fun notificar(mensaje: String) {
            servicio.enviarMensaje(mensaje)
        }
    }

    fun main() {
        val notificadorEmail = Notificador(EmailService())
        notificadorEmail.notificar("Hola Mundo por Email")

        val notificadorSMS = Notificador(SMSServico())
        notificadorSMS.notificar("Hola Mundo por SMS")
    }
}