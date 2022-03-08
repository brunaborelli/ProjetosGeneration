package ex1

import ex1.Animal

class Cachorro(
    nome: String, idade: Int, val raca: String
) : Animal(nome, idade) {

    override fun som() {
        println("*latindo*")
    }

    override fun act() {
        println("*correndo*")
    }

}