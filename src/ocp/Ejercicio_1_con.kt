package ocp_con

interface TipoGrafica {
    fun ejecutar(Tipo: String): String
}

class Barra : TipoGrafica {
    override fun ejecutar(Tipo: String) = "Dibujando gráfica de barras"
}

class Linea : TipoGrafica {
    override fun ejecutar(Tipo: String) = "Dibujando gráfica de líneas"
}

class Grafica {
    fun dibujar(tipo: TipoGrafica, Tipo: String): String =
        tipo.ejecutar(Tipo)
}

fun main() {
    val grafica = Grafica()
    println("${grafica.dibujar(Barra(),"Barra")}")
    println("${grafica.dibujar(Linea(),"Linea")}")
}

