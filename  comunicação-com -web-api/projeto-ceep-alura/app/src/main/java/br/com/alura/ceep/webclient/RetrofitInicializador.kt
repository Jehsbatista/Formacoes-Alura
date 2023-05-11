package br.com.alura.ceep.webclient

import retrofit2.Retrofit

class RetrofitInicializador {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8080/")
        .build()
}