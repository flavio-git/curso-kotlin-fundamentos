package Curso2

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int // estamos sobreescrevendo a propertie da interface "Autenticavel"
): Autenticavel {

}