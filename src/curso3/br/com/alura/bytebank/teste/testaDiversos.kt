package curso3.br.com.alura.bytebank.teste

import curso3.br.com.alura.bytebank.modelo.Cliente
import curso3.br.com.alura.bytebank.modelo.Endereco

fun testeDiversos(){

    println("Chamando TesteDiversos")

    //Objects Expressions | Anonymous Classes
    val fernanda  = object  {
        val nome: String = "Fernanda"
        val cpf: String = "1234"
        val senha: Int = 1000

        fun autentica(senha: Int) = this.senha === senha
    }

    val a: Int = 5
    val b: Int = 5

    val nome1 = "Flávio"
    val nome2 = "Flávio"

    println("Teste com Inteiro")
    println(a.hashCode())
    println(b.hashCode())
    println(a.equals(b))
    println(b.equals(a))

    println("Teste com String")
    println(nome1.hashCode())
    println(nome2.hashCode())
    println(nome1.equals(nome2))
    println(nome2.equals(nome1))

    var cliente1 = Cliente(
        nome = "Ricardo",
        cpf = "111.222.333",
        endereco = Endereco(),
        senha = 1234
    )

    val cliente2 = Cliente(
        nome = "Ricardo",
        cpf = "111.222.333",
        endereco = Endereco(),
        senha = 1234
    )

    println("Teste com Classes Criadas")
    println(cliente1.hashCode())
    println(cliente2.hashCode())
    println(cliente1.equals(cliente2))
    println(cliente2.equals(cliente1))

    cliente1 = cliente2

    println("Teste com Classes Criadas - Copiando uma classe para outra")
    println(cliente1.hashCode())
    println(cliente2.hashCode())
    println(cliente1.equals(cliente2))
    println(cliente2.equals(cliente1))

    val pessoa = Pessoa()


}

class Pessoa(){


}