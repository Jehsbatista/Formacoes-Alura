fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
    //val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana") //não repete o elemento
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)


//comportamentos do Set
    println(assistiramCursoAndroid union assistiramCursoKotlin) //utilizando union para somar
    println(assistiramCursoAndroid subtract assistiramCursoKotlin) //utilizando subtract para subtrair
    println(assistiramCursoAndroid intersect  assistiramCursoKotlin) //utilizando técnica de intersecção
}