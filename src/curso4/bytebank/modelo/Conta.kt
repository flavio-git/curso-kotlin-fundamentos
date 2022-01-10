package curso4.bytebank.teste

import curso4.bytebank.exceptions.FalhaAutenticacaoException
import curso4.bytebank.exceptions.SaldoInsuficienteException

var totalContas: Int = 0 // variável global, sempre que uma nova conta é criada há um incremento nessa variável
    private set         // essa variável global funciona como uma propertie, podemos deixar os atributos e métodos privados

abstract class Conta(
    private val titular: Cliente,
    private val numeroConta: String,
    private val agencia: String,
    private var saldo: Double
) : Autenticavel by titular{

// caso não informamos a instrução 'by titular'
//    override val senha: Int
//        get() = titular.senha

    companion object Contador { // não é necessário declarar o nome do companion
        var total: Int = 0
            private set
    }

    init {
        totalContas++  // incrementando pela variável global
        Contador.total++     // incrementando pelo companion
    }

// caso não informamos a instrução 'by titular'
//    override fun autentica(senha: Int): Boolean {
//        return titular.autentica(senha)
//    }

    val nomeSistema = titular.nome.uppercase()

    fun getTitular(): Cliente {
        return this.titular
    }

    fun getNumeroConta(): String {
        return this.numeroConta
    }

    fun getAgencia(): String {
        return this.agencia
    }

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo;
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    open fun saca(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente para saque.\n")
        }
    }

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser transferido: $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }

}