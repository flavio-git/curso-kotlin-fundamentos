package curso4.bytebank.exceptions

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception (mensagem) {

}