package Curso2

import jdk.incubator.foreign.CLinker

fun main() {
    println("Bem vindo ao ByteBank")

    val conta1 = Conta(
        titular = "Flavio",
        agencia = "1020",
        numeroConta = "0001",
        saldo = 0.00
        )

    val conta2 = ContaPoupanca(
        titular = "Fernanda",
        agencia = "1020",
        numeroConta = "0002",
        saldo = 0.00
    )

    val conta3 = ContaCorrente(
        titular = "Eduardo",
        agencia = "1030",
        numeroConta = "0003",
        saldo = 100.00
    )

    conta3.saca(55.00)

    imprimeInfo(conta3)

}

    fun imprimeInfo(cliente: Conta){
        println("Cliente: ${cliente.nomeSistema} | Saldo: ${cliente.getSaldo()}")
    }