package br.com.alura.ceep.webclient

import android.util.Log
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.model.NotaRequisicao
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

    suspend fun salva(nota: Nota) {
        try {
            val resposta = notaService.salvar(
                nota.id, NotaRequisicao(
                    titulo = nota.titulo,
                    descricao = nota.descricao,
                    imagem = nota.imagem
                )
            )
            if (resposta.isSuccessful) {
                Log.i(TAG, "Nota salva com sucesso")
            } else {
                Log.i(TAG, "Nota não foi salva")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Falha ao tentar salvar", e)
        }
    }
}