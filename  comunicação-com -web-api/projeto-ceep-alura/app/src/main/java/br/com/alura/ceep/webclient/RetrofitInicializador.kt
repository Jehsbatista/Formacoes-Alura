package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.services.NotaService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class RetrofitInicializador {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.1.5:8080/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val notaServive = retrofit.create(NotaService::class.java)
}