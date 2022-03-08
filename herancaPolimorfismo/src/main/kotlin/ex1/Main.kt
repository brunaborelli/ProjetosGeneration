import ex1.Cachorro
import ex1.Cavalo
import ex1.Preguica

fun main() {

    val cachorro = Cachorro("Yev", 2, "Golden")
    println("CACHORRO \nNome: ${cachorro.nome}  \nIdade: ${cachorro.idade} \nRaça: ${cachorro.raca}\n")

    cachorro.som()
    cachorro.act()

    //

    val cavalo = Cavalo("Flicka", 4, "Preta")
    println("\nCAVALO \nNome: ${cavalo.nome}  \nIdade: ${cavalo.idade} \nCor: ${cavalo.cor}\n")

    cavalo.som()
    cavalo.act()

    //

    val preguica = Preguica("ShuLan", 3)
    println("\nBICHO-PREGUIÇA \nNome: ${preguica.nome}  \nIdade: ${preguica.idade} \n")

    preguica.som()
    preguica.act()

}