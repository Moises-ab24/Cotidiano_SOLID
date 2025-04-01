package isp_con

interface Trabajador {
    fun trabajar()
}

interface Administrador {
    fun administrar()
}

interface Auditoriador {
    fun auditar()
}

class Desarrollador : Trabajador {
    override fun trabajar() {
        println("Desarrollando software...")
    }
}

fun main() {
    val dev = Desarrollador()
    dev.trabajar()
}