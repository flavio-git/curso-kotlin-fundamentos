package curso4.bytebank.teste

import curso4.bytebank.exceptions.FalhaAutenticacaoException
import curso4.bytebank.exceptions.SaldoInsuficienteException

fun testaContas(){

    println("Chamando TestaContas")

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

    println("Variável Global | Total de contas criadas = $totalContas")
    println("Companion | Total de contas criadas = ${Conta.Contador.total}") // pode ser apenas Conta.total

    println("Cliente Eduarda Senha: ${contaEduarda.senha}")

    contaEduarda.deposita(1000.00)
    contaGuilherme.deposita(500.00)

    try {
        contaGuilherme.transfere(500.00, contaEduarda, 4321)
        println("Transferência realizada com sucesso.")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência.")
    } catch (e: FalhaAutenticacaoException){
        println("Falha de autenticação.")
    } catch (e: Exception){
        println("Erro desconhecido")
    }

}