package curso3.br.com.alura.bytebank.modelo

abstract class Conta(
            private val titular: Cliente,
            private val numeroConta: String,
            private val agencia: String,
            private var saldo: Double
){

    val nomeSistema = titular.nome.uppercase()

    fun getTitular(): Cliente{
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

    open fun saca(valor: Double){
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