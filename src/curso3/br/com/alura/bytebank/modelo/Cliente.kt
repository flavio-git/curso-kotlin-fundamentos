package curso3.br.com.alura.bytebank.modelo

import curso2.modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    override val senha: Int // estamos sobreescrevendo a propertie da interface "Autenticavel"
): Autenticavel {

    override fun toString(): String {
        return "Cliente nome: $nome, CPF: $cpf"
    }


}