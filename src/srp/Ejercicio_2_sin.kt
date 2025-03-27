package srp_sin

class Cliente(val nombre: String, val edad: Int) {
    fun guardarCliente() {
        println("Guardando cliente en la base de datos...")
    }
    fun enviarCorreo() {
        println("Enviando correo a $nombre...")
    }
}
fun main() {
    val cliente = Cliente("Carlos", 28)
    cliente.guardarCliente()
    cliente.enviarCorreo()
}

