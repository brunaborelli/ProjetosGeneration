fun main() {

    /* EXERCICIO 5
    Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    No final, mostre a soma dos números digitados.(DO...WHILE) */

    var num: Int
    var soma = 0

    do{
        print("Digite um número: ")
        num = readLine()!!.toInt()

        soma += num
    } while(num != 0)

    print("A soma dos números digitados é: $soma")
}