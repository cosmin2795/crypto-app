package com.example.composetemplate.domain.repository

import com.example.composetemplate.data.remote.dto.CoinDetailsDto
import com.example.composetemplate.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinsByName(coinId: String): CoinDetailsDto
}