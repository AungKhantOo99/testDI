package com.example.data

import com.example.data.Network.Response.PostResponse
import retrofit2.Call
import retrofit2.http.GET


interface ApiServices {
    @GET("posts")
    fun getpost():Call<ArrayList<PostResponse>>
}