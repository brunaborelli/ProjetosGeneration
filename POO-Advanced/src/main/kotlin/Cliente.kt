class Cliente(private var nome: String) {
    private var telefone = ""
    private var endereco = ""

    var listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco) {
        this.telefone = telefone
    }

    init {
        if (nome.isEmpty()) {
            throw Exception("A classe cliente não foi instanciada corretamente")
        }
    }

    fun adicionar(item: String) {
        if (item.isEmpty()) {
            println("Valor inválido")
        } else {
            listaDeCompras.add(item)
            println("Item $item adicionado com sucesso")
        }

        /* print("Digite um item para ser adicionado à lista: ")
        val item = readLine()!!

        while (true)
            try {
                if (!(item.isEmpty())) {
                    println("Item adicionado!")
                }
            } catch (e: Exception) {
                println("Valor inválido")
            } */

    }

    fun remover(item: String) {
        if (item.isEmpty()) {
            println("Valor inválido")
        } else if (listaDeCompras.contains(item)){
            listaDeCompras.remove(item)
            println("O item $item foi removido com sucesso")
        } else {
            println("O item $item não existe na lista")
        }
    }

    fun listar() {
        listaDeCompras.forEach{
            println(it)
        }
    }
}