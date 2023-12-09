package com.example.apiprojectmaulanda.api

import com.example.apiprojectmaulanda.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}