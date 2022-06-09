package com.example.composetemplate.presentation.coin_details

import com.example.composetemplate.domain.model.CoinDetails

class CoinDetailsState(
    val isLoading: Boolean = false,
    val coin: CoinDetails? = null,
    val errorMessage: String = ""
)