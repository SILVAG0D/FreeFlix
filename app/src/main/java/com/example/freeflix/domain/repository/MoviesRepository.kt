package com.example.freeflix.domain.repository

import com.example.freeflix.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {
    fun getMovies(apiKey: String) : Flow<List<Movie>>
}