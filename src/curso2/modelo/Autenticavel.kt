package curso2.modelo

interface Autenticavel {

    val senha: Int // isso garante que a classe que for "autenticavel" terá uma propertie senha

    fun autentica(senha: Int): Boolean {
        println("Autenticação pela Interface")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}