package Curso2

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    var plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr
        }

}