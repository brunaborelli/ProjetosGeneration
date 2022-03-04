
// EXERCICIO 6
/* Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
   em seguida crie um objeto conta bancaria,
   defina as instancias deste objeto e apresente as informações deste objeto no console. */

class ContaBanco {

    var titular = ""
    var tipo = 0 // 1 corrente, 2 poupança
    var saldo = 0.0

    fun mostraSaldo() {
        println("O saldo da sua conta é $saldo")
    }

    fun deposito(valor: Double) {
        if(valor <= 0) {
            println("Não é possivel realizar esse deposito")
        }
        else {
            saldo += valor
            println("Deposito de R$$valor realizados com sucesso")
        }
    }

    fun saque(valor: Double) {
        if(saldo <=  0) {
            println("Saldo insuficiente")
        } else if(valor <= 0) {
            println("Não é possivel realizar o saque")
        } else if(valor >= saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque de $valor realizado com sucesso")
        }
    }
}

fun main() {
    val conta = ContaBanco()

    conta.titular = "Bruna"
    conta.tipo = 1
    conta.saldo = 2000.00

    conta.mostraSaldo()

    print("Digite o valor do saque: ")
    val saque = readLine()!!.toDouble()
    conta.saque(saque)

    print("Digite o valor do deposito: ")
    val deposito = readLine()!!.toDouble()
    conta.saque(deposito)

    conta.mostraSaldo()
}