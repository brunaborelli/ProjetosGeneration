fun main() {

    /* EXERCICIO 3
    Solicitar a idade de várias pessoas e imprimir:
    Total de pessoas com menos de 21 anos.
    Total de pessoas com mais de 50 anos.
    O programa termina quando idade for =-99. (WHILE) */

    var menores = 0
    var maiores = 0
    var idade= 0

    while(idade != -99) {
        print("Digite sua idade: ")
        idade = readLine()!!.toInt()

        if (idade <= 21){
            menores += 1
        }
        else{
            maiores += 1
        }
    }
    println("Total de pessoas com menos de 21 anos: ${menores - 1} \n" +
            "Total de pessoas com mais de 50 anos: $maiores")
    
}