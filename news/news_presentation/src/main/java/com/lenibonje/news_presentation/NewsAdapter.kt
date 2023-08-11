package com.lenibonje.news_presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.lenibonje.domain.databinding.ViewHolderArticlesBinding
import com.lenibonje.news_domain.model.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    private var list = listOf<Article>()

    fun setData(list: List<Article>) {
        this.list = list
        notifyItemInserted(this.list.lastIndex)
    }

    inner class MyViewHolder(val viewBinding: ViewHolderArticlesBinding) :
        RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ViewHolderArticlesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return this.list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.viewBinding.apply {
            val item = list[position]
            ivArticle.loadImage(item.urlToImage)
            tvHeadlines.text = item.title
            tvContent.text = item.content
        }
    }

    fun ImageView.loadImage(url: String){
        val circularProgressView = CircularProgressDrawable(this.context)
        circularProgressView.strokeWidth = 5f
        circularProgressView.centerRadius = 20f
        circularProgressView.start()
        Glide.with(this).load(url).placeholder(circularProgressView)
            .error(com.google.android.material.R.drawable.mtrl_ic_error).into(this)

    }

}