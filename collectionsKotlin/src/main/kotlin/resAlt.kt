fun main() {

    val estoque = mutableListOf<String>()

    while (true) {

        println("\nEstoque do Fulano\n")
        println("Armazenar dados da List")
        println("Remover dados da list;")
        println("Atualizar dados da list.")
        println("Apresentar todos os dados da list.")
        println("Sair")

        println("Escolha uma opção: ")
        val opc = readLine()!!.toInt()

        when (opc) {
            1 -> {
                print("Digite um item para ser adicionado ao estoque: ")
                val item = readLine()!!

                if (item.isEmpty()) {
                    println("Valor inválido")
                } else {
                    estoque.add(item)
                    println("Item adicionado com sucesso")
                }
            }

            2 -> {
                print("Digite um item para ser removido do estoque: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Valor inválido")
                }
                else {
                    if(estoque.contains(item)){
                        estoque.remove(item)
                        println("O item $item foi removido com sucesso")
                    }
                    else {
                        println("O item $item não existe na lista")
                    }
                }
            }

            4 -> {
                if (estoque.isEmpty()) {
                    println("O estoque está vazio")
                } else {
                    estoque.forEach{
                        println(it)
                    }
                }
            }

            3 -> {
                //atualização index
                println("Selecione um item de 0 a ${estoque.size - 1}")
                val pos = readLine()!!.toInt()

                if(pos in 0 .. (estoque.size - 1)){
                    print("\nDigite o produto que será atualizado: ")
                    val item = readLine()!!

                    estoque[pos] = item
                }
                else{
                    println("Esse item não existe")
                }
            }





        }
    }
}