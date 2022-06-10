package com.example.composetemplate.data.repository

import com.example.composetemplate.data.local.CoinLocalSource
import com.example.composetemplate.data.local.model.CoinLocal
import com.example.composetemplate.data.remote.CoinRemoteSource
import com.example.composetemplate.data.remote.model.CoinDetailsRemote
import com.example.composetemplate.data.remote.model.CoinRemote
import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.domain.repository.CoinRepository
import com.example.composetemplate.utils.Outcome
import com.example.composetemplate.utils.mappers.toDomain
import com.example.composetemplate.utils.mappers.toLocal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinRemoteSource: CoinRemoteSource,
    private val coinLocalSource: CoinLocalSource
) : CoinRepository {

    override suspend fun getCoins(): Flow<Outcome<List<Coin>>> = flow {
        emit(Outcome.Loading(true))

        try {
            val remoteCoins = coinRemoteSource.getAllCoins()
            coinLocalSource.insertCoins(remoteCoins.map(CoinRemote::toLocal))
            val localCoins = coinLocalSource.getAllCoins()
            emit(Outcome.Success(localCoins.map(CoinLocal::toDomain)))
        } catch (ex: IOException) {
            emit(Outcome.Error("No internet connection"))
        } finally {
            emit(Outcome.Loading(false))
        }
    }

    override suspend fun getCoinsByName(coinId: String): CoinDetailsRemote =
        coinRemoteSource.getCoinDetails(coinId)
}