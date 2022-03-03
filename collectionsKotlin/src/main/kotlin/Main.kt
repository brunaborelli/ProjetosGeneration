fun main() {

    //Exercicio Lista 03/03/22
    /* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque.
    O programa deverá atender as seguintes funcionalidades:
    input
    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list. */

    val estoque = mutableListOf<String>()

    fun listar(estoque: MutableList<String>): MutableList<String> {

        while (true) {
            print("Informe os produtos do estoque: ")
            val item = readLine()!!.uppercase()

            if (item.isEmpty()) {
                break
            } else {
                estoque.add(item)
            }
        }
        return estoque
    }

    // caso o outro método dê errado //val temp = listar(estoque)


    // Armazenar dados da List
    fun est(estoque: MutableList<String>) {

        print("Exibir estoque? s/n  -  ")
        val resp = readLine()!!.uppercase()
        if (resp == "S") {
            estoque.forEach() {
                println(it)
            }
        } else {
            menu()
        }
        //para o metodo reserva // println(temp)
    }


    // Remover dados da list;
    fun del(estoque: MutableList<String>) {
        while (true) {
            print("Informe o produto a ser removido: ")
            val item = readLine()!!.uppercase()

            if (estoque.contains(item)) {
                estoque.remove(item)
                println("Item $item removido com sucesso")
            } else {
                println("O item $item não existe na lista")
            }
        }
    }

    //Atualizar dados da list.
    fun att(estoque: MutableList<String>) {

        estoque.forEach() {
            println(it)
        }
        print("Informe o atual produto que deseja atualizar: ")
        val item = readLine()!!.uppercase()

        val index = estoque.indexOf(item)
        print("Informe o novo produto: ")
        val novo = readLine()!!.uppercase()
        estoque.removeAt(index)
        estoque.add(index, novo)

        println("\nEstoque atualizado: ")
        estoque.forEach() {
            println(it)
        }
    }


    fun exibir(estoque: MutableList<String>) {
        estoque.forEach() {
            println(it)
        }
    }

    fun menu() {

    }
}
