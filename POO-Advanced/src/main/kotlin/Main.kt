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

    //print()
    try {
        val josivan = Cliente("Josivan", "Tal rua", "(11)99999-9999")
    } catch (e: Exception) {
        println(e.message)
    }

    while (true) {
        println("1 - Adicionar itens ao carrinho")
        println("2 - Remover itens do carrinho")
        println("3 - Listar itens do carrinho")
        println("Digite qualquer outro valor para sair")

        println("\n Digite a opção desejada: ")
        //val opc =
    }
}