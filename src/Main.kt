

fun main(){
    val cliente1 = Cliente(nombre = "Nuria Acosta", domicilio = Domicilio(calle = "de las flores", numero = 355))
    val cliente2 = Cliente(nombre= "Jorge Ruso", domicilio = Domicilio(calle = "Mirasol", numero = 218))
    val cliente3 = Cliente(nombre = "Julian Rodriguez", domicilio = Domicilio(calle = "La mancha", numero = 761) )
    val compra1 = Compra(cliente1,5,12780.78)
    val compra2 = Compra(cliente2, 7,699.0)
    val compra3 = Compra(cliente1, 7, 532.90)
    val compra4 = Compra(cliente3, 12, 5715.99)
    val compra5 = Compra(cliente2, 15, 958.0)
    val listadoCompras = repositorioCompras()
    listadoCompras.agregarCompra(compra1)
    listadoCompras.agregarCompra(compra2)
    listadoCompras.agregarCompra(compra3)
    listadoCompras.agregarCompra(compra4)
    listadoCompras.agregarCompra(compra5)
    listadoCompras.mostrarDomicilios()
}


