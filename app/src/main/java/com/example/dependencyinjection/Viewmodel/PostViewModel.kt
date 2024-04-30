package com.example.dependencyinjection.Viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.data.Network.Response.PostResponse
import com.example.data.Repo.Repo
import com.example.dependencyinjection.PAGE
import com.example.dependencyinjection.VIEWBY

class PostViewModel(private val postData: Repo): ViewModel(){
    fun getpost():LiveData<ArrayList<PostResponse>>{
        return postData.getpost(PAGE, VIEWBY)
    }
}