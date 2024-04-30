package com.example.data.Repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.data.Network.Response.PostResponse
import com.example.data.RetrofitClient.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoImp():Repo {
    override fun getpost(PAGE: Int, VIEWBY: String): MutableLiveData<ArrayList<PostResponse>> {
        val data=MutableLiveData<ArrayList<PostResponse>>()
       RetrofitClient.JsonApi.getpost().enqueue(object : Callback<ArrayList<PostResponse>>{
            override fun onResponse(call: Call<ArrayList<PostResponse>>, response: Response<ArrayList<PostResponse>>) {
                Log.d("Hello",response.body().toString())
                Log.d("Hello","Hello")
             //   data.value=response.body()
                data.postValue(response.body())
               }
            override fun onFailure(call: Call<ArrayList<PostResponse>>, t: Throwable) {

            }
        })
        return data
    }

}