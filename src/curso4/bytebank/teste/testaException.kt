package curso4.bytebank.teste

import java.lang.ArithmeticException
import java.lang.ClassCastException

fun testaException(){
    println("Chamando TestaException ")

    val endereco: Any = Any()

    try {
        endereco as Endereco // Essa instrução irá causar um erro de execução no programa
    } catch (e: ClassCastException){
        println("Peguei Exception da classe ClassCastException") // Tratando o erro de execução
    } finally {
        println("O Finally sempre será executado")
    }

    var dividento: Int = 10
    var divisor: Int = 0

    try {
        println("Tentando dividir $dividento por $divisor")
        dividento / divisor
    } catch (e: ArithmeticException){
        println("Peguei Exception da classe ArithmeticException")
    } finally {
        println("O Finally sempre será executado")
    }

    divisor = 2

    try {
        println("Tentando dividir $dividento por $divisor")
        dividento / divisor
    } catch (e: ArithmeticException){
        println("Peguei Exception da classe ArithmeticException")
    } finally {
        println("O Finally sempre será executado")
    }

}