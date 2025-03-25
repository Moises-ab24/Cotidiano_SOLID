package srp_con

class Producto(val nombre: String, val precio: Double)

class ProductoDescuento {
    fun calcularDescuento(porcentaje: Double, producto: Producto): Double {
        return producto.precio - (producto.precio * porcentaje / 100)
    }
}

class ProductoPrinter {
    fun imprimirDetalles(producto: Producto) {
        println("Producto: ${producto.nombre}, Precio: ${producto.precio}")
    }
}

fun main() {
    val producto = Producto("Laptop", 1500.0)
    val descuento = ProductoDescuento()
    val printer = ProductoPrinter()

    println("Precio con descuento: ${descuento.calcularDescuento(10.0, producto)}")
    printer.imprimirDetalles(producto)
}
