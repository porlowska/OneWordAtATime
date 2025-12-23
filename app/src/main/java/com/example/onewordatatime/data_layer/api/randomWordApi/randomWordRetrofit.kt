package com.example.onewordatatime.data_layer.api.randomWordApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//https://random-word-api.herokuapp.com/word?number=1
val randomWordRetrofit: Retrofit = Retrofit.Builder()
    .baseUrl("https://random-word-api.herokuapp.com/")
    .addConverterFactory(GsonConverterFactory.create()) // converts JSON to Kotlin objects
    .build()

val randomWordApi = randomWordRetrofit.create(IRandomWordApiService::class.java)
//retrofit.create() is a java instance so we need to change java to kotlin therefore ::class.java instead of .class
