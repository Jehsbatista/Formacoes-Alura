class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val pl: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return  salario + pl
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
