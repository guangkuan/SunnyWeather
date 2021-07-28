package com.example.sunnyweather.logic.network

import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("https://api.seniverse.com/v3/weather/now.json?key=SLkatm5dQYK5Xs6PB&location=beijing&language=zh-Hans&unit=c")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}