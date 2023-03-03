package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "alex", cpf = "", senha = 0),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "fran", cpf = "", senha = 1),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldo}")
    println("Saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldo}")
}
