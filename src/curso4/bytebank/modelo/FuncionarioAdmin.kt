package curso4.bytebank.teste

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    open fun autentica(senha: Int): Boolean {
        println("Autenticação pela Classe Abstrata 'FuncionarioAdmin'")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}