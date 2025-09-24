package com.example.freeflix.presentation.screen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.freeflix.databinding.ItemMovieBinding
import com.example.freeflix.presentation.screen.adapter.model.MovieModel

class MovieAdapter(
    private val movies: List<MovieModel>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
    class MovieViewHolder(val binding: ItemMovieBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(binding)
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       val movie = movies[position]
        holder.binding.movieTitle.text = movie.movieTitle
        holder.binding.moviePoster.setImageResource(movie.imageResource)
    }
}