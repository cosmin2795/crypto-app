package com.example.composetemplate.utils.mappers

import com.example.composetemplate.data.local.model.CoinLocal
import com.example.composetemplate.data.remote.model.CoinDetailsRemote
import com.example.composetemplate.data.remote.model.CoinRemote
import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.domain.model.CoinDetails

fun CoinRemote.toDomain(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}

fun CoinRemote.toLocal(): CoinLocal {
    return CoinLocal(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}

fun CoinDetailsRemote.toDomain(): CoinDetails {
    return CoinDetails(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}

fun CoinLocal.toDomain(): Coin {
    return Coin(
        id, isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}