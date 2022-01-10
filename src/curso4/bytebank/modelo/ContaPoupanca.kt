package curso4.bytebank.teste

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