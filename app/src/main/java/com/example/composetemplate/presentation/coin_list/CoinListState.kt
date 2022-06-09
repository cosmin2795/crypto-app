package com.example.composetemplate.presentation.coin_list

import com.example.composetemplate.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coinList: List<Coin> = listOf(),
    val errorMessage: String = ""
)