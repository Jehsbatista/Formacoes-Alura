package br.com.alura.bytebank.teste

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