package curso3.br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
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