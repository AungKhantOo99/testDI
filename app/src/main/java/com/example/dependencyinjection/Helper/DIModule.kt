package com.example.dependencyinjection

import com.example.data.Repo.Repo
import com.example.data.Repo.RepoImp
import com.example.dependencyinjection.Viewmodel.PostViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val DiModule =  module {
    single<Repo> { RepoImp() }
    viewModel{ PostViewModel(get()) }
}