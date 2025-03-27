package ocp_con

interface TipoArchivo {
    fun ejecutar(archivo: String, Tipo: String): String
}

class ftp : TipoArchivo {
    override fun ejecutar(archivo: String, Tipo: String) = "Enviando archivo por FTP: $archivo"
}

class http : TipoArchivo {
    override fun ejecutar(archivo: String, Tipo: String) = "Enviando archivo por HTTP: $archivo"
}

class EnvioArchivos {
    fun enviar(tipo: TipoArchivo, archivo: String, Tipo: String): String =
        tipo.ejecutar(archivo, Tipo)
}

fun main() {
    val envio = EnvioArchivos()
    println("${envio.enviar(ftp(),"documento.txt", "ftp")}")
    println("${envio.enviar(http(),"documento.txt", "http")}")
}
