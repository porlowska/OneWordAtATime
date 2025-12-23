package com.example.onewordatatime.data_layer.api.randomWordApi

import retrofit2.http.GET
import retrofit2.Call

//This file defines an API services for fetching random words
interface IRandomWordApiService {
    // This annotation specifies that the HTTP method - GET, and the endpoint URL - "word?number=1".
    @GET("word?number=1")
    // This method returns a Call object with a generic type of List<String>,
    // which represents how the data looks like in the response.
    fun getRandomWord(): Call<List<String>>

}

//https://random-word-api.herokuapp.com/word?number=1

/* The response in a JSON format of an array of strings:
[
    "anchorperson"
]
*/
