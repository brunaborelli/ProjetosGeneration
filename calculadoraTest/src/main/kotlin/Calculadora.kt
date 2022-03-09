class Calculadora {
    companion object {

        fun adicao(a: Double, b: Double): Double {
            return a + b
        }

        fun sub(a: Double, b: Double): Double {
            return a - b
        }

        fun multi(a: Double, b: Double): Double {
            return a * b
        }

        fun div(a: Double, b: Double): Double {
            return a / b
        }

        fun calc() {
            println(
                "\nSelecione a operação que deseja realizar: \n" +
                        "1 - Adição \n" +
                        "2 - Subtração \n" +
                        "3 - Multiplicação \n" +
                        "4 - Divisão"
            )

            var op = readLine()!!.toInt()

            print("Insira os valor a: ")
            var a = readLine()!!.toDouble()
            print("Insira os valor b: ");
            var b = readLine()!!.toDouble()


            var result: Double = 0.0
            when (op) {
                1 -> result = adicao(a, b)
                2 -> result = sub(a, b)
                3 -> result = multi(a, b)
                4 -> result = div(a, b)
                else -> calc()
            }
            println("O resultado da operação $op entre $a e $b = $result")
        }
    }
}