package curso4.bytebank.teste

fun testaExpressions(){

    println("Chamando TestaExpressions")

    val input: String = "a"

    val inputInt: Int? = try { input.toInt() } catch (e: NumberFormatException) {null}

    println("InputInt = $inputInt")

    val valorRecebido: Double = 100.0

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    val valorComTaxa_2: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }

}