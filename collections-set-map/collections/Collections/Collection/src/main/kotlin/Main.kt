fun main() {
    val assistiramCursoAndroid = listOf("Alex, Fran, João, Leo")
    val assistiramCursoKotlin = listOf("Alex, Fran, Marcelo")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid

    println(assistiramAmbos.distinct())
}