package com.example.composetemplate.data.remote

import com.example.composetemplate.data.remote.dto.CoinDetailsDto
import com.example.composetemplate.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinService {

    @GET("v1/coins")
    suspend fun getAllCoins(): List<CoinDto>

    @GET("v1/coins/{coin}")
    suspend fun getCoinDetails(@Path("coin") coin: String): CoinDetailsDto
}