import org.junit.Assert.*
import org.junit.Test

class CaixaEletronicoTest{

    private val objetoDeTeste = CaixaEletronico2()


    @Test
    fun checarSaida_valorInt_stringNotas(){
        val saida = objetoDeTeste.geraSaque(50)
        assertEquals("1 nota de 50", saida)

    }

    
}