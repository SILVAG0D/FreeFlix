package com.example.freeflix.data.remote.dto

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("range")
    var range: String,
    @SerializedName("majorDimension")
    var majorDimension: String,
    @SerializedName("values")
    var values: ArrayList<MovieResponse>
)
