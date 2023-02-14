fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
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

    if (contaFran.transfere(30.0, contaAlex)) {
        println("transação sucedida")
    } else {
        println("falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set  //apenas a classe consegue ajustar o valor de saldo

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }

}

fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    val contaMaria = Conta("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
    var i = 0
    while (i < 6) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
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