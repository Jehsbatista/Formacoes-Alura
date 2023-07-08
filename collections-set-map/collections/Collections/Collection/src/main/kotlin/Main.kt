fun main() {
    val banco = BancoDeNomes()
    banco.salva("alex")
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

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