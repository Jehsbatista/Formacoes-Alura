fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbos.distinct())
}