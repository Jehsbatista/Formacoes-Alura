private fun testaComportamentosMap() {
    val pedidosB: MutableMap<Int, Double> = mutableMapOf(
        1 to 20.0,
        2 to 50.0,
        3 to 200.0
    ) //utilizando infix "to" que faz o mesmo efeito do Pair. Não é recomendado para vários valores por perda de performance

    println(pedidosB + mapOf(Pair(4, 90.0))) //insere um novo elemento
    println(pedidosB)

    println(pedidosB.minus(4)) //subtrai um elemento

    println(pedidosB.putAll(setOf(4 to 10.0, 5 to 45.0, 6 to 70.0))) //insere uma nova lista a anterior
    print(pedidosB)

    pedidosB += setOf(4 to 10.0, 5 to 45.0, 6 to 70.0) //faz o mesmo comportamento que putAll
    print(pedidosB)

    pedidosB.keys.remove(1) //remove uma chave
    println(pedidosB)

    pedidosB.values.remove(50.0) //remove um valor
    println(pedidosB)
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