package com.example.composetemplate.data.repository

import com.example.composetemplate.data.remote.CoinService
import com.example.composetemplate.data.remote.dto.CoinDetailsDto
import com.example.composetemplate.data.remote.dto.CoinDto
import com.example.composetemplate.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val coinService: CoinService) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> =
        coinService.getAllCoins()

    override suspend fun getCoinsByName(coinId: String): CoinDetailsDto =
        coinService.getCoinDetails(coinId)
}