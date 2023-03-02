package model

abstract class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        protected set  //apenas a classe consegue ajustar o valor de saldo

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }

}