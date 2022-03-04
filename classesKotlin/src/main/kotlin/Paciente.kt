
// EXERCICIO 7
/* Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
   em seguida crie um objeto paciente, defina as instancias deste objeto
   e apresente as informações deste objeto no console. */

data class Paciente (/*var  nome: String,*/ var quarto: Int, var medico: String){
    var nome = ""
    var sobrenome = ""
    // var quarto = 0
    // var medico = ""
    var visitante = ""
    var horario = ""


    fun visita() {
        println("Visita de $visitante $sobrenome para paciente $nome - Quarto $quarto, às $horario")
    }

}

fun main() {
    val el = Paciente(23, "Hiroshi")

    print("Digite seu nome: ")
    el.visitante = readLine()!!.uppercase()
    print("Digite seu sobrenome: ")
    el.sobrenome = readLine()!!.uppercase()
    val a = el.sobrenome

    print("Digite o nome do paciente: ")
    el.nome = readLine()!!
    print("Digite o sobrenome do paciente: ")
    el.sobrenome = readLine()!!.uppercase()
    val b = el.sobrenome

    print("Digite o horário da visita: ")
    el.horario = readLine()!!

    if(a == b){
        println("\nVisita agendada com sucesso!")
        el.visita()
    } else {
        println("\nNão foi possivel agendar sua visita, tente mais tarde ou entre em contato com nossa únidade")
    }

}