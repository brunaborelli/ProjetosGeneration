package ex1

import ex1.Animal

class Preguica(
    nome: String, idade: Int
) : Animal(nome, idade) {

    override fun som() {
        println("*som ininteligível*")
    }

    override fun act() {
        println("*subindo na árvore*")
    }

}