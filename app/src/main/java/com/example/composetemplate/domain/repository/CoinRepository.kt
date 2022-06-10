package com.example.composetemplate.domain.repository

import com.example.composetemplate.data.remote.model.CoinDetailsRemote
import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.utils.Outcome
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    suspend fun getCoins(): Flow<Outcome<List<Coin>>>

    suspend fun getCoinsByName(coinId: String): CoinDetailsRemote
}