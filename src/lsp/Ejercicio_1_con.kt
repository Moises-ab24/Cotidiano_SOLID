package lsp_con

open class Cuadrado()
open class Area(var lado: Int, var altura: Int) : Cuadrado() {
    open fun calcularArea(): Int {
        return lado * altura
    }
}

class Rectangulo : Area(5, 10)

fun main() {
    val cuadrado: Area = Rectangulo()
    println("Área: ${cuadrado.calcularArea()}")
}

