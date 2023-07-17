fun testaSet() {
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
    println(assistiramCursoAndroid union assistiramCursoKotlin) //devolve um novo Set com a soma dos elementos dos conjuntos
    println(assistiramCursoAndroid subtract assistiramCursoKotlin) //devolve um novo Set subtraindo os elementos contidos no segundo conjunto
    println(assistiramCursoAndroid intersect assistiramCursoKotlin) //devolve um novo Set apenas com os elementos contidos em ambos os conjuntos
}