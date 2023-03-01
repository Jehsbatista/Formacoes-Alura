class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val pl: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 12345
) {
    override fun bonificacao(): Double {
        return salario + pl
    }
}
