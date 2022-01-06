package curso1

fun main() {
    println("Bem vindo ao ByteBank")
    val titular: String = "Flávio"
    val numeroConta: String = "1020-3"
    val agencia: String = "4032"
    var saldo: Double = 0.00
    saldo += 100

    println("Titular: $titular")
    println("Agência: $agencia")
    println("Conta: $numeroConta")
    println("Saldo: $saldo")

    testaSaldo(saldo, numeroConta)

    val conta1 = Conta("Flávio", "1020-3", "4032", 0.0)
    println(conta1.getNumeroConta())

    println()

    conta1.deposita(2000.00)
    println("O novo saldo da Conta do Flávio é ${conta1.getSaldo()}")

    println("Estou sacando 500 reais da conta.")
    conta1.saca(500.00)
    println("O novo saldo da Conta do Flávio é ${conta1.getSaldo()}")

    println("Agora vou tentar sacar 1501 reais da conta.")
    conta1.saca(1501.00)
    println("O saldo da conta do Flávio é " + conta1.getSaldo())
    println()

    val conta2 = Conta("Fernanda", "1090-4", "4040", 0.0)

    val deposito1 = 1000.00
    println("Realizando novo deposito na conta do Flávio de $deposito1")
    conta1.deposita(1000.00)
    println("O novo saldo da Conta do Flávio é ${conta1.getSaldo()}")
    println()

    println("Saldo conta Flávio ${conta1.getSaldo()}")
    println("Saldo conta Fernanda ${conta2.getSaldo()}")
    println()

    println("Transferindo 500 reais para a conta da Fernanda.")
    conta1.transfere(500.00, conta2)

    println("Saldo conta Flávio ${conta1.getSaldo()}")
    println("Saldo conta Fernanda ${conta2.getSaldo()}")
    println()

    println("Tentando transferir 10000 reais para a conta da Fernanda.")
    conta1.transfere(10000.00, conta2)

    println("Saldo conta ${conta1.nomeSistema} ${conta1.getSaldo()}")
    println("Saldo conta Fernanda ${conta2.getSaldo()}")
    println()

}

class Conta(private val titular: String,
            private val numeroConta: String,
            private val agencia: String,
            private var saldo: Double
){

    val nomeSistema = titular.uppercase()

    fun getTitular(): String{
        return this.titular
    }

    fun getNumeroConta(): String{
        return this.numeroConta
    }

    fun getAgencia(): String{
        return this.agencia
    }

    fun getSaldo(): Double{
        return this.saldo
    }

    fun setSaldo(saldo: Double){
        this.saldo = saldo;
    }

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if (valor <= this.saldo){
            this.saldo -= valor
        } else {
            println("Saldo insuficiente para saque.\n")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if (this.saldo >= valor){
            this.saldo -= valor
            destino.saldo += valor
            println("Transferência realizada com sucesso.\n")
            return true
        } else {
            println("Não foi possível realizar a transferência. Saldo insuficiente.\n")
            return false
        }
    }

}

fun testaSaldo(saldo: Double, numeroConta: String) {
    if (saldo > 0) {
        println("Saldo da conta $numeroConta está positivo.")
    } else if (saldo == 0.0) {
        println("Saldo da conta $numeroConta está zerado.")
    } else {
        println("Saldo da conta $numeroConta está negativo.")
    }

    //Outra forma de escrever o if para esse caso.
    when {
        saldo > 0.0 -> {
            println("Saldo da conta $numeroConta está positivo.")
        }
        saldo == 0.0 -> {
            println("Saldo da conta $numeroConta está zerado.")
        }
        else -> {
            println("Saldo da conta $numeroConta está negativo.")
        }
    }

    //Ou dessa outra forma:
    when {
        saldo > 0.0 -> println("Saldo da conta $numeroConta está positivo.")
        saldo == 0.0 -> println("Saldo da conta $numeroConta está zerado.")
        else -> println("Saldo da conta $numeroConta está negativo.")
    }

}



