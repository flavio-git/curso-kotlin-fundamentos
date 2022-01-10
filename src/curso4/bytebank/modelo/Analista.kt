package curso4.bytebank.teste

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
) {
    override val bonificacao: Double
        get() {
            return salario * 0.10
        }


}