package curso2.modelo

class ContaCorrente(
    titular: String,
    numeroConta: String,
    agencia: String,
    saldo: Double
) : Conta(
    titular = titular,
    numeroConta = numeroConta,
    agencia = agencia,
    saldo = saldo,
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.10
        super.saca(valorComTaxa)
    }

}