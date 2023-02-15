fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salário: ${alex.salario}")
    println("Bonificação ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salário: ${fran.salario}")
    println("Bonificação ${fran.bonificacao()}")

    if (fran.autentica(123)){
        println("autenticou com sucesso")
    }else{
        println("falha na autenticação")
    }
}



