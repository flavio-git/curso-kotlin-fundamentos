package curso3.br.com.alura.bytebank.teste

import curso3.br.com.alura.bytebank.modelo.Cliente
import curso3.br.com.alura.bytebank.modelo.ContaCorrente
import curso3.br.com.alura.bytebank.modelo.ContaPoupanca
import curso3.br.com.alura.bytebank.modelo.Endereco

fun testaContas(){

    val guilherme = Cliente(
        nome = "Guilherme",
        cpf = "111.222",
        senha = 1234,
        endereco = Endereco(
            logradouro = "Rua Almeida",
            numero = 2050,
            bairro = "Leblon",
            cidade = "Rio de Janeiro",
            estado = "Rio de Janeiro",
            cep = "9150-325",
            complemento = "APTO 503"
        )
    )

    val eduarda = Cliente(
        nome = "Eduarda",
        cpf = "222.333",
        senha = 4321,
        endereco = Endereco()
    )

    val contaGuilherme = ContaCorrente(
        titular = guilherme,
        numeroConta = "2030",
        agencia = "803",
        saldo = 0.0
    )

    val contaEduarda = ContaPoupanca(
        titular = eduarda,
        numeroConta = "3020",
        agencia = "803",
        saldo = 0.0
    )

}