package curso2.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha), Autenticavel {

    override val bonificacao: Double
        get() {
            return (salario * 0.10) + salario
        }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }

}