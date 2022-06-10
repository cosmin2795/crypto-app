package com.example.composetemplate.di

import android.content.Context
import androidx.room.Room
import com.example.composetemplate.data.local.CoinDatabase
import com.example.composetemplate.data.local.CoinLocalSource
import com.example.composetemplate.data.remote.CoinRemoteSource
import com.example.composetemplate.data.repository.CoinRepositoryImpl
import com.example.composetemplate.domain.repository.CoinRepository
import com.example.composetemplate.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
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
    fun provideCoinRemoteSource(retrofit: Retrofit): CoinRemoteSource =
        retrofit.create(CoinRemoteSource::class.java)

    @Provides
    @Singleton
    fun provideCoinRepository(
        coinRemoteSource: CoinRemoteSource,
        coinLocalSource: CoinLocalSource
    ): CoinRepository =
        CoinRepositoryImpl(coinRemoteSource, coinLocalSource)

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, CoinDatabase::class.java, "coinDb").build()

    @Provides
    @Singleton
    fun provideCoinLocalSource(db: CoinDatabase) = db.coinLocalSource
}