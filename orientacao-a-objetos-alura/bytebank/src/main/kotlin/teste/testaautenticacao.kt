package teste

import model.Cliente
import model.Diretor
import model.Gerente
import model.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "carlos",
        cpf = "666.666.666-66", salario = 3.000,
        senha = 1234
    )
    val diretor = Diretor(
        nome = "carlos",
        cpf = "777.777.777-77", salario = 4.000,
        senha = 12345,
        pl = 200.0
    )

    val cliente = Cliente(
        nome = "José",
        cpf = "888.888.888-88",
        senha = 123456,
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 12345)
    sistema.entra(cliente, 123456)
}