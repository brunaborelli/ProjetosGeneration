fun main() {

    // EXERCICIO 2
    // Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var par: Int = 0
    var impar: Int = 0

    for(i in 1..10){
        print("Digite um número: ")
        var num = readLine()!!.toInt()

        if(num % 2 == 0){
            par += 1
        }
        else{
            impar += 1
        }
    }
    println("$par números são pares e $impar números são impares")
}