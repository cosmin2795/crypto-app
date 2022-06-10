package com.example.composetemplate.data.local

import androidx.room.*
import com.example.composetemplate.data.local.model.CoinLocal

@Dao
interface CoinLocalSource {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCoins(coins: List<CoinLocal>)

    @Query("SELECT *FROM CoinLocal")
    suspend fun getAllCoins(): List<CoinLocal>
}