fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    //banco.salva("alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("Jéssica", "Roberto", "Carlos", "Ana", "Maria")
    println(nomes)

    for (nome in nomes) {
        println(nome)
    }
    println("Tem o nome Carlos na lista? ${nomes.contains("Carlos")}")
    println("Quantos nomes possui essa lista? ${nomes.size}")
}