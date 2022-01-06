package curso3.br.com.alura.bytebank.modelo

class ContaPoupanca(
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

}