package com.example.composetemplate.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.composetemplate.data.local.model.CoinLocal

@Database(version = 1, entities = [CoinLocal::class])
abstract class CoinDatabase : RoomDatabase() {
    abstract val coinLocalSource: CoinLocalSource
}