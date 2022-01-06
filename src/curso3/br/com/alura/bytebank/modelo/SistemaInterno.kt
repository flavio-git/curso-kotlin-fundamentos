package curso3.br.com.alura.bytebank.modelo

import curso2.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if (admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
        } else {
            println("Login inválido")
        }
    }
}