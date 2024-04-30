package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dependencyinjection.Adapter.PostAdapter
import com.example.dependencyinjection.Viewmodel.PostViewModel
import com.example.dependencyinjection.databinding.ActivityPostBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostActivity : AppCompatActivity() {
    private val postViewModel: PostViewModel by viewModel()
    private lateinit var postAdapter : PostAdapter
    private lateinit var binding: ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
        postAdapter = PostAdapter(this)
        initView()
        postViewModel.getpost().observe(this) {
            postAdapter.setPostList(it)
        }
    }
    private fun initView(){
       binding.recyclerPost.apply {
           layoutManager = LinearLayoutManager(this@PostActivity)
           adapter = postAdapter
       }
    }
}