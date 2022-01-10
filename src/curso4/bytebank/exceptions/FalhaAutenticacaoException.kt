package curso4.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha de autenticação"
) : Exception(mensagem) {
}