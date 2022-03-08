package ex1

import ex1.Animal

class Cavalo (
    nome: String, idade: Int, val cor: String
) : Animal(nome, idade) {

    override fun som() {
        println("*relinchando*")
    }

    override fun act() {
        println("*correndo*")
    }

}