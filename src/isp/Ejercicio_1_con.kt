package isp_con

interface Encendedor {
    fun encender()
}

interface Apagador {
    fun apagar()
}

interface Router {
    fun conectarWifi()
}

interface Actualizador {
    fun actualizarFirmware()
}

class Lampara : Encendedor, Apagador {
    override fun encender() {
        println("Encendiendo la lámpara")
    }
    override fun apagar() {
        println("Apagando la lámpara")
    }
}

fun main() {
    val lampara = Lampara()
    lampara.encender()
    lampara.apagar()
}
