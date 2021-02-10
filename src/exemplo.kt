class EncontreOTelefone {
    class ParLetraNumero(val letra: String, val num: String)
    val mapaDeNumeros = listOf(
        ParLetraNumero("ABC", "2"),
        ParLetraNumero("DEF", "3"),
        ParLetraNumero("GHI", "4"),
        ParLetraNumero("JKL", "5"),
        ParLetraNumero("MNO", "6"),
        ParLetraNumero("PQRS", "7"),
        ParLetraNumero("TUV", "8"),
        ParLetraNumero("WXYZ", "9"),
    )
    fun lerMensagem(mensagem: String): String {
        var resultado = ""
        mensagem.onEach { caracter ->
            if (caracter == '1' || caracter == '0' || caracter == '-') {
                resultado = resultado.plus(caracter)
            } else {
                mapaDeNumeros.forEach { par ->
                    if (par.letra.contains(caracter)) {
                        resultado = resultado.plus(par.num)
                    }
                }
            }
        }
        return resultado
    }
}