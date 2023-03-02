package model

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        println("bonificação analista")
        return  salario * 0.1
    }
}
