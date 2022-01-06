package curso3.br.com.alura.bytebank.teste

import curso2.modelo.Analista
import curso2.modelo.CalculadoraBonificacao
import curso2.modelo.Diretor
import curso2.modelo.Gerente

fun testaFuncionarios() {
    println("Bem vindo ao ByteBank")

    val funcionario1 = Analista(nome = "Flávio", cpf = "111.111.111-11", salario = 1000.0)
    val funcionario2 = Analista(salario = 2000.0, nome = "Fernanda", cpf = "222.222.222.-22")

    val funcionario2Bonificacao = funcionario2.bonificacao

    println("Funcionário: ${funcionario1.nome} | Bonificação ${funcionario1.bonificacao}")
    println("Funcionária: ${funcionario2.nome} | Bonificação $funcionario2Bonificacao")

    val funcionario3 = Gerente(
        nome = "Augusto",
        cpf = "333.333.333-33",
        salario = 3000.00,
        senha = 1234
    )

    println("Funcionário: ${funcionario3.nome} | Bonificação ${funcionario3.bonificacao}")

    println(funcionario3.autentica(4321))
    println(funcionario3.autentica(1234))

    val funcionario4 = Diretor(
        nome = "Rogerio",
        cpf = "444.444.444-44",
        salario = 5000.00,
        plr = 2500.00,
        senha = 1234
    )

    println("Funcionário: ${funcionario4.nome} | Bonificação ${funcionario4.bonificacao}")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(funcionario1)
    calculadora.registra(funcionario2)
    calculadora.registra(funcionario3)
    calculadora.registra(funcionario4)

    println("Total de bonificação: ${calculadora.total}")
}