package com.example.composetemplate.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CoinLocal(
    @PrimaryKey
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)