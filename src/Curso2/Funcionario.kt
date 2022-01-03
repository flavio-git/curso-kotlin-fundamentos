package Curso2

open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    open val bonificacao: Double
        get() {
            return salario * 0.10
        }

}