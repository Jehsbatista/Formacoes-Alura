fun main() {
    testaColecao()
}

fun testaColecao() {
    val nomes: MutableCollection<String> = mutableListOf("Jéssica", "Roberto", "Carlos", "Ana", "Maria")
    println(nomes)

    for (nome in nomes) {
        println(nome)
    }
    println("Tem o nome Carlos na lista? ${nomes.contains("Carlos")}")
    println("Quantos nomes possui essa lista? ${nomes.size}")
}