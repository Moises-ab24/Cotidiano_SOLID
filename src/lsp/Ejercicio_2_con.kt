package lsp_con

open class Dispositivo
open class Encendidos : Dispositivo() {
    open fun encender() {
        println("Encendiendo dispositivo encendible...")
    }
}

class Televisor : Encendidos()
class Radio : Dispositivo()

fun main() {
    val dispositivo = Televisor()
    dispositivo.encender()
}