package com.example.onewordatatime.data_layer.api.dictionaryApi

import com.example.onewordatatime.data_layer.api.DefinitionResponseDTO
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Path

//This file defines an API service for fetching word definitions
interface IDictionaryApiService {
    @GET("{word}")
    // This method returns a Call object with a generic type of List<String>,
    // which represents how the data looks like in the response.
    // The @Path annotation indicates that the value of the "word" parameter will be
    // dynamically inserted into the URL at the position of {word}.
    fun getWordDefinition(@Path("word") word:String): Call<List<DefinitionResponseDTO>>

}
//https://api.dictionaryapi.dev/api/v2/entries/en/{word}

// The response in a JSON format of array that will be mapped to List<DefinitionResponseItem>
