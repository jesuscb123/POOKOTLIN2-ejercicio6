

fun main(){
    val cliente1 = Cliente(nombre = "Nuria Acosta", domicilio = Domicilio(calle = "de las flores", numero = 355))
    val cliente2 = Cliente(nombre= "Jorge Ruso", domicilio = Domicilio(calle = "Mirasol", numero = 218))
    val compra1 = Compra(cliente1,5,12780.78)
    val compra2 = Compra(cliente2, 7,699.0)
    val listadoCompras = repositorioCompras()
    listadoCompras.agregarCompra(compra1)
    listadoCompras.agregarCompra(compra2)
    listadoCompras.mostrarDomicilios()
}


