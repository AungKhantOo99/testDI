package com.example.dependencyinjection.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.data.Network.Response.PostResponse
import com.example.dependencyinjection.R

class PostAdapter(private var context:Context):
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    private var postListData = ArrayList<PostResponse>()
    fun setPostList(postList : List<PostResponse>){
        this.postListData = postList as ArrayList<PostResponse>
        notifyDataSetChanged()
    }
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.post_item,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
       return postListData.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.title).setText(postListData[position].title)
        holder.itemView.findViewById<TextView>(R.id.body).setText(postListData[position].body)

    }
}