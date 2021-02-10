import org.junit.Assert.*
import org.junit.Test


class NumeroRomanoTest{

    private val objetoDeTeste = NumeroRomano()

    @Test
    fun LerImput_apenasLetrasMaiusculas_true(){

        val valorRecebido = objetoDeTeste.lerInput("YGASDJAB")
        assertEquals(true, valorRecebido)
    }

    @Test
    fun leImput_stringmista_false(){

        val valorRecebido = objetoDeTeste.lerInput("GDG56542")
        assertEquals(false, valorRecebido)
    }

    @Test
    fun lerImput_stringminuscula_false(){
        val valorRecebido = objetoDeTeste.lerInput("asdasas")
        assertEquals(false, valorRecebido)
    }

    @Test
    fun conversao_imputRomano_inteiroCinco(){
        val valorRecebido = objetoDeTeste.converter("V")
        assertEquals(5, valorRecebido)
    }
}