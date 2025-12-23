package com.example.onewordatatime.data_layer.api.dictionaryApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//https://api.dictionaryapi.dev/api/v2/entries/en/{word}
val dictionaryRetrofit: Retrofit = Retrofit.Builder()
    .baseUrl("https://api.dictionaryapi.dev/api/v2/entries/en/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val dictionaryApi = dictionaryRetrofit.create(IDictionaryApiService::class.java)
