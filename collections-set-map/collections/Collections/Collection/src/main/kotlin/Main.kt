fun main() {

    val pedidosB: MutableMap<Int, Double> = mutableMapOf(
        1 to 20.0,
        2 to 50.0,
        3 to 200.0
    ) //utilizando infix "to" que faz o mesmo efeito do Pair. Não é recomendado para vários valores por perda de performance

    println(pedidosB.getOrElse(5) {//caso não encontre a chave será retornado outro valor desejado
        "não tem o pedido"
    })

    println(pedidosB.keys)//retorna todas as chaves
    println(pedidosB.values)//retorna todos os valores

    println( pedidosB.filter { (numero: Int, valor: Double?) -> //faz um filtro dos valores desejados
        numero > 2 && valor > 20.0
    })
}

private fun testaMap(pedidosB: MutableMap<Int, Double>) {
    println(pedidosB)
    val pedidos = pedidosB[1]  //acessando valor por chave com tratamento caso seja nulo
    pedidos?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidosB) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    //comportamentos do map
    pedidosB[3] = 60.0  //insere elemento
    println(pedidosB)

    pedidosB[1] = 10.0  //atualiza o elemento
    println(pedidosB)

    pedidosB.putIfAbsent(4, 100.0) //insere novo valor, porém só atualiza o valor caso não tenha o mesmo
    println(pedidosB)
    pedidosB.putIfAbsent(4, 200.0)
    println(pedidosB)

    pedidosB.remove(4) //remove o elemento
    println(pedidosB)
}