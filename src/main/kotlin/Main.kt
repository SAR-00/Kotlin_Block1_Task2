fun main() {
    val likes = 1_111_111
    val termination = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println(termination)
}