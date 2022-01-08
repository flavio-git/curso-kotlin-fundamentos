package curso3.br.com.alura.bytebank.teste

import curso3.br.com.alura.bytebank.modelo.Cliente
import curso3.br.com.alura.bytebank.modelo.Endereco

fun testaClientes(){

    println("Chamando TestaClientes")

    val ricardo = Cliente(
        nome = "Ricardo",
        cpf = "111.222.333",
        endereco = Endereco(),
        senha = 1234
    )

    val lucia = Cliente(
        nome = "Lucia",
        cpf = "222.333.444",
        endereco = Endereco(),
        senha = 1234
    )

    val monica = Cliente(
        nome = "Monica",
        cpf = "222.333.444",
        endereco = Endereco(),
        senha = 1234
    )

    println(ricardo)
    println(lucia)
    println(monica)

}