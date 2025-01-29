class repositorioCompras() {
    val listaCompras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra){
        listaCompras.add(compra)
    }


    fun domicilios(): MutableSet<Domicilio>{
        val domicilios = mutableSetOf<Domicilio>()
        for(compra in listaCompras){
            domicilios.add(compra.cliente.domicilio)
        }
        return domicilios
    }


    fun mostrarDomicilios(){
        for(compra in listaCompras){
            println("${compra.cliente.nombre}, ${compra.dia}, ${compra.monto}, ${compra.cliente.domicilio.dirCompleta()} ")
        }
    }
}