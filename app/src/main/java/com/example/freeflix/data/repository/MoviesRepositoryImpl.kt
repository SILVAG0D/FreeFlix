package com.example.freeflix.data.repository

import com.example.freeflix.data.remote.service.MoviesService
import com.example.freeflix.domain.model.Movie
import com.example.freeflix.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MoviesRepositoryImpl(
    private val service: MoviesService
) : MoviesRepository {

    override fun getMovies(apiKey: String): Flow<List<Movie>> = flow {
        val response = service.getMovies(apiKey)
        val movies = response.values.map { row ->
            Movie(
                row.title,
                row.genre,
                row.filmYear,
                row.grade,
                row.imageUrl
            )
        }
        emit(movies)
    }
}