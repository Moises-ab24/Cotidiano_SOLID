package dip_con

interface Email {
    fun enviarMensaje(mensaje: String)
}

class EmailService : Email {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}

class Notificador(private val emailService: Email) {
    fun notificar(mensaje: String) {
        emailService.enviarMensaje(mensaje)
    }
}

fun main() {
    val notificador = Notificador(EmailService())
    notificador.notificar("Hola Mundo!")
}