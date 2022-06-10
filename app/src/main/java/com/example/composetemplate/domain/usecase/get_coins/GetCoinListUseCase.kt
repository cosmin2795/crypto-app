package com.example.composetemplate.domain.usecase.get_coins

import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.domain.repository.CoinRepository
import com.example.composetemplate.utils.Outcome
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinListUseCase @Inject constructor(private val coinRepository: CoinRepository) {

    suspend operator fun invoke(): Flow<Outcome<List<Coin>>> = coinRepository.getCoins()
}