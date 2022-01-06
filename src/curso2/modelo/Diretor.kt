package curso2.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int, // estamos sobreescrevendo a propertie da interface "Autenticavel"
    var plr: Double
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha), Autenticavel {

    override val bonificacao: Double
        get() {
            return (salario * 0.10) + salario + plr
        }

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }

}