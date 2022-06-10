package com.example.composetemplate.domain.usecase.get_coin

import com.example.composetemplate.data.remote.model.toDomain
import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.domain.model.CoinDetails
import com.example.composetemplate.domain.repository.CoinRepository
import com.example.composetemplate.utils.Outcome
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinDetailsUseCase @Inject constructor(private val coinRepository: CoinRepository) {

    //todo move this in repo and use LocalDataSource
    operator fun invoke(coinId: String): Flow<Outcome<CoinDetails>> = flow {
        try {
            emit(Outcome.Loading(true))
            val coins = coinRepository.getCoinsByName(coinId).toDomain()
            emit(Outcome.Loading(false))
            emit(Outcome.Success(coins))
        } catch (ex: HttpException) {
            Outcome.Error<List<Coin>>(ex.message())
        }
    }
}