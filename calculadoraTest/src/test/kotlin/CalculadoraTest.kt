import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculadoraTest {

    @Test
    fun adicaoTest() {
        Assertions.assertEquals(3.0, Calculadora.adicao(2.0, 1.0))
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(1.0, Calculadora.sub(2.0, 1.0))
    }

    @Test
    fun multiTest() {
        Assertions.assertEquals(2.0, Calculadora.multi(2.0, 1.0))
    }

    @Test
    fun divTest() {
        Assertions.assertEquals(2.0, Calculadora.div(2.0, 1.0))
    }

}