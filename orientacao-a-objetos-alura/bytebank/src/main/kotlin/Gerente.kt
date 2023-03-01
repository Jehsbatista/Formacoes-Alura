class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 1234
), Autenticavel {

    override fun bonificacao(): Double {
        return salario
    }
}
