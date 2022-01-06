package curso2.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int // estamos sobreescrevendo a propertie da interface "Autenticavel"
): Autenticavel {

}