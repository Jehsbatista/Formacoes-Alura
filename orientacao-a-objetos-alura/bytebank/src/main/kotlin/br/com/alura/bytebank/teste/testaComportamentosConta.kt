package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "alex", cpf = "", senha = 2)
    val contaAlex = ContaCorrente(titular = alex, numero = 1001)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "fran", cpf = "", senha = 3)
    val contaFran = ContaPoupanca(titular = fran, 1002)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depósito na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println()

    println("Depósito na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println()

    println("Saque na conta do Alex")
    contaAlex.saca(10.0)
    println(contaAlex.saldo)

    println()

    println("Saque na conta da Fran")
    contaFran.saca(10.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(valor = 30.0, destino = contaAlex)) {
        println("transação sucedida")
    } else {
        println("falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}