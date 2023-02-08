fun main() {

    for (i in 1..5) {
        println("Hello World!")
        println("Bem vindo ao Bytebank")
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }

    //testacondicoes(saldo)
}

fun testacondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("conta positiva")
        }

        saldo == 0.0 -> {
            println("conta neutra")
        }

        else -> {
            println("conta negativa")
        }
    }
}