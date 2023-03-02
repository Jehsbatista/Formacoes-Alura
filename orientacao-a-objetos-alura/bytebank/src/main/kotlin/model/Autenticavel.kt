package model

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}