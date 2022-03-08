/*
    Crie uma Classe Cliente,
    contendo os atributos encapsulados, um construtor padrão
    e pelo menos mais duas opções de construtores conforme sua percepção,
    com os atributos: nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */

fun main() {

    print("Digite seu nome: ")
    val nome = readLine()!!

    print("Digite seu endereço: ")
    val endereco = readLine()!!

    print("Digite seu telefone: ")
    val telefone = readLine()!!

    try {
        // instanciando objeto cliente
        val cliente = Cliente(nome, endereco, telefone)

        while (true) {
            println("\n --- MENU --- \n")
            println("1 - Adicionar itens ao carrinho")
            println("2 - Remover itens do carrinho")
            println("3 - Listar os itens do carrinho")
            println("Digite qualquer outro valor para sair")

            var opc = 0

            while (true) {
                print("\nDigite a opção desejada: ")

                try {
                    opc = readLine()!!.toInt()
                    break
                } catch (e: Exception) {
                    println("Valor inválido")
                }
            }

            when (opc) {
                1 -> {
                    print("Digite o item que deseja adicionar: ")
                    var item = readLine()!!
                    cliente.adicionar(item)
                }
                2 -> {
                    print("Digite o item a ser removido: ")
                    val item = readLine()!!
                    cliente.remover(item)
                }
                3 -> cliente.listar()

                else -> break
            }
        }

    }catch(e: Exception) {
        println(e.message)
    }
}