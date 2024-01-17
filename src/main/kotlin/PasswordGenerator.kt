import kotlin.random.Random

object PasswordGenerator {

    fun generatePassword(): String {
        val password = generateNumbers() + generateSmallLetters() + generateCapitalLetters() + generateSymbols()
        shuffleArray(password)

        return stringifyPassword(password)
    }

    private fun generateNumbers(): Array<String> {
        var numbers = emptyArray<String>()
        for (i in 0..Random.nextInt(7, 11)) numbers += Generator.generateNumber().toString()
        return numbers
    }

    private fun generateSmallLetters(): Array<String> {
        var letters = emptyArray<String>()
        for (i in 0..Random.nextInt(2, 4)) letters += Generator.generateSmallLetter()
        return letters
    }

    private fun generateCapitalLetters(): Array<String> {
        var letters = emptyArray<String>()
        for (i in 0..Random.nextInt(2, 4)) letters += Generator.generateCapitalLetter()
        return letters
    }

    private fun generateSymbols(): Array<String> {
        var symbols = emptyArray<String>()
        for (i in 0..Random.nextInt(2, 5)) symbols += Generator.generateSymbol()
        return symbols
    }

    private fun shuffleArray(array: Array<String>) {
        for (i in 5..15) array.shuffle()
    }

    private fun stringifyPassword(password: Array<String>): String {
        var output = ""
        for (el in password) output += output
        return output
    }
}