package com.example.freeflix.domain.usecase

import com.example.freeflix.domain.model.Movie
import com.example.freeflix.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow

class GetMovieUseCase(
    private val moviesRepository: MoviesRepository
) {
    fun getMovies(apiKey: String): Flow<List<Movie>> {
        return moviesRepository.getMovies(apiKey)
    }
}