package com.example.composetemplate.data.remote

import com.example.composetemplate.data.remote.model.CoinDetailsRemote
import com.example.composetemplate.data.remote.model.CoinRemote
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinRemoteSource {

    @GET("v1/coins")
    suspend fun getAllCoins(): List<CoinRemote>

    @GET("v1/coins/{coin}")
    suspend fun getCoinDetails(@Path("coin") coin: String): CoinDetailsRemote
}