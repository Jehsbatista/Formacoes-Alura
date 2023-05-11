package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.services.NotaService
import retrofit2.Retrofit
import retrofit2.create

class RetrofitInicializador {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8080/")
        .build()

    val notaServive = retrofit.create(NotaService::class.java)
}