package br.com.alura.ceep.webclient

import android.util.Log
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.services.NotaService

private const val TAG = "webclient"
private val notaService: NotaService = RetrofitInicializador().notaServive

class NotaWebClient {
    suspend fun buscaTodas(): List<Nota>? {
        return try {
            val notasResposta = notaService.buscaTodas()
            return notasResposta.map { notaResposta ->
                notaResposta.nota
            }
        } catch (e: Exception) {
            Log.e(TAG, "buscatodas")
            null
        }
    }
}