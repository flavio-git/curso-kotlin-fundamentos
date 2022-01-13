package curso5

fun main(){

    // declarando um array de inteiros
    val idades: IntArray = IntArray(4);

    val idade1: Int = 25;
    val idade2: Int = 19;
    val idade3: Int = 33;
    val idade4: Int = 20;

    idades[0] = idade1;
    idades[1] = idade2;
    idades[2] = idade3;
    idades[3] = idade4;

    println("Primeira forma do for")
    for (idade in idades) println(idade) // podemos colocar também dentro de um escopo

    println("Segunda forma do for")
    for (idade: Int in idades){
        println(idade);
    };

    println("Usando while")

    var contador: Int = 0;
    while (contador < idades.size){
        println(idades[contador])
        contador++
    }

    val numbers = mutableListOf<Int>()

    numbers.add(idade1)
    numbers.add(idade2)
    numbers.add(idade3)
    numbers.add(idade4)

}