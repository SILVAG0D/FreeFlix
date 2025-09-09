package com.example.freeflix.data.remote.service

import com.example.freeflix.data.remote.dto.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesService {

    @GET("14nS16EqhaHbugY2hJgHgQJ_RRhmfiObUiUp9Uw8pe2o/values/movies!A1:J4")
    suspend fun getMovies(@Query("key") apiKey: String): MoviesResponse
}