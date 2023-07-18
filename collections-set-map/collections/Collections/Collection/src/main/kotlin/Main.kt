fun main() {
    val pedidosA = mapOf(
        Pair(1, 20.0), Pair(2, 34.0)
    ) //Pair armazena valores para o mapa

    val pedidosB = mapOf(
        1 to 20.0,
        2 to 50.0
    ) //utilizando infix "to" que faz o mesmo efeito do Pair. Não é recomendado para vários valores por perda de performance

    println(pedidosB)

    val pedidos = pedidosB[1]  //acessando valor por chave com tratamento caso seja nulo
    pedidos?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidosB){
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}