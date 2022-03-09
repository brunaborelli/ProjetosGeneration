fun main() {
// CALCULADORA - FUNÇÕES COM RETORNO

    Calculadora.calc()
    print("Deseja realizar outra operação? s/n - ")
    var ans = readLine()!!.uppercase()

    while(true){
        when(ans){
            "S" -> Calculadora.calc()
            else -> break
        }
    }
}