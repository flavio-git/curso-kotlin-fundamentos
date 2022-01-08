package curso3.br.com.alura.bytebank

import curso3.br.com.alura.bytebank.modelo.Conta
import curso3.br.com.alura.bytebank.modelo.totalContas
import curso3.br.com.alura.bytebank.teste.testaContas



fun main(){

    val fernanda  = object  {
        val nome: String = "Fernanda"
        val cpf: String = "1234"
        val senha: Int = 1000

        fun autentica(senha: Int) = this.senha === senha
    }

    testaContas()

    println("Variável Global | Total de contas criadas = $totalContas")
    println("Companion | Total de contas criadas = ${Conta.Contador.total}") // pode ser apenas Conta.total

    val qualquer: Any = Any()
    println(qualquer)



}