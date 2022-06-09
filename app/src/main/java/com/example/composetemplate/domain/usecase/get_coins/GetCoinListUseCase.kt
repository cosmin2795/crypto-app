package com.example.composetemplate.domain.usecase.get_coins

import com.example.composetemplate.data.remote.dto.toDomain
import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.domain.repository.CoinRepository
import com.example.composetemplate.utils.Outcome
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinListUseCase @Inject constructor(private val coinRepository: CoinRepository) {

    operator fun invoke(): Flow<Outcome<List<Coin>>> = flow {
        try {
            emit(Outcome.Loading(true))
            val coinDetails = coinRepository.getCoins().map { it.toDomain() }
            emit(Outcome.Loading(false))
            emit(Outcome.Success(coinDetails))
        } catch (ex: HttpException) {
            emit(Outcome.Error(ex.message()))
        }
    }
}