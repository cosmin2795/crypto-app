package com.example.composetemplate.di

import com.example.composetemplate.data.remote.CoinService
import com.example.composetemplate.data.repository.CoinRepositoryImpl
import com.example.composetemplate.domain.repository.CoinRepository
import com.example.composetemplate.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideCoinService(retrofit: Retrofit): CoinService =
        retrofit.create(CoinService::class.java)

    @Provides
    @Singleton
    fun provideCoinRepository(coinService: CoinService): CoinRepository =
        CoinRepositoryImpl(coinService)
}