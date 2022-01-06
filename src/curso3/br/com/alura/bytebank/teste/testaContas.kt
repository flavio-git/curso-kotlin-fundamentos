package curso3.br.com.alura.bytebank.teste

import curso3.br.com.alura.bytebank.modelo.Cliente
import curso3.br.com.alura.bytebank.modelo.Endereco

fun testaContas(){

    val guilherme = Cliente(
        nome = "Guilherme",
        cpf = "111.222",
        senha = 1234,
        endereco = Endereco()
    )

    val endereco = Endereco(
        logradouro = "Rua Almeida",
        numero = 2050,
        bairro = "Leblon",
        cidade = "Rio de Janeiro",
        estado = "Rio de Janeiro",
        cep = "9150-325",
        complemento = "APTO 503"
    )



}