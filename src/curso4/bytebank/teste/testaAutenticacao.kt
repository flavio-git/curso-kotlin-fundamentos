package curso4.bytebank.teste

fun testaAutenticacao(){

    println("Chamando TestaAutenticação")

    val eclair = Gerente(
        nome = "Eclair",
        cpf = "125",
        salario = 100.00,
        senha = 123
    )

    val rogerio = Diretor(
        nome = "Rogério",
        cpf = "111",
        salario = 10000.00,
        senha = 321,
        plr = 1000.00
    )

    val cesar = Cliente(
        nome = "Cesar",
        cpf = "333",
        senha = 55
    )

    val byteBank = SistemaInterno()

    println("Testando autenticação Eclair (Gerente): ")
    byteBank.entra(eclair, 122)
    byteBank.entra(eclair, 123)

    println("Testando autenticação Rogério (Diretor): ")
    byteBank.entra(cesar, 122)
    byteBank.entra(cesar, 321)

    println("Testando autenticação César (Cliente): ")
    byteBank.entra(cesar, 122)
    byteBank.entra(cesar, 55)

}