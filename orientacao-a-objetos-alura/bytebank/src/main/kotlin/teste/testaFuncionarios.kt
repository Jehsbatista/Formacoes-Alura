package teste

import model.Analista
import model.CalculadoraBonificacao
import model.Diretor
import model.Gerente

fun testaFuncionarios() {
    val alex = Analista(
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

    val guilherme = Diretor(
        nome = "guilherme",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 12345,
        pl = 200.0
    )
    println("nome: ${guilherme.nome}")
    println("cpf: ${guilherme.cpf}")
    println("salário: ${guilherme.salario}")
    println("Bonificação ${guilherme.bonificacao()}")
    println("Pl  ${guilherme.pl}")

    val maria = Analista(
        nome = "maria",
        cpf = "444.444.444-44",
        salario = 3.000
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(guilherme)
    calculadora.registra(maria)
    println("valor total de bonificação: ${calculadora.total}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
}