package br.com.alura.ceep.webclient

import br.com.alura.ceep.model.Nota

class NotaWebClient {
    suspend fun buscaTodas(): List<Nota> {
        val notasResposta = RetrofitInicializador().notaServive.buscaTodas()
        return notasResposta.map { notaResposta ->
            notaResposta.nota
        }
    }
}