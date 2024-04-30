package com.example.data.Repo

import androidx.lifecycle.MutableLiveData
import com.example.data.Network.Response.PostResponse


interface Repo {
    fun getpost(PAGE: Int, VIEWBY: String):MutableLiveData<ArrayList<PostResponse>>
}