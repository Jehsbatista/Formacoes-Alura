package br.com.alura.bytebank.teste

import br.com.alura.bytebank.model.Cliente
import br.com.alura.bytebank.model.ContaCorrente
import br.com.alura.bytebank.model.ContaPoupanca

fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(Cliente(nome = "joão", cpf = "", senha = 9),1002)
    val contaMaria = ContaPoupanca(Cliente(nome = "maria", cpf = "", senha = 8),1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
