import kotlin.random.Random

object Generator {

    fun generateNumber(): Int {
        return Random.nextInt(0, 10)
    }

    fun generateSmallLetter(): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        return alphabet[Random.nextInt(0, alphabet.length)].toString()
    }

    fun generateCapitalLetter(): String {
        return generateSmallLetter().uppercase()
    }

    fun generateSymbol(): String {
        val symbols = "@!()&*^%$#"
        return symbols[Random.nextInt(0, symbols.length)].toString()
    }
}