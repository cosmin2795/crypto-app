package com.example.composetemplate.presentation.coin_details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.composetemplate.domain.usecase.get_coin.GetCoinDetailsUseCase
import com.example.composetemplate.utils.Outcome
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinDetailsViewModel @Inject constructor(val getCoinDetailsUseCase: GetCoinDetailsUseCase) :
    ViewModel() {

    init {

    }

    private val _state = mutableStateOf(CoinDetailsState())
    val state: State<CoinDetailsState>
        get() = _state

    suspend fun getCoinDetails(coinId: String) {
        getCoinDetailsUseCase(coinId).collect { coinDetails ->
            when (coinDetails) {
                is Outcome.Success -> _state.value = CoinDetailsState(coin = coinDetails.data)
                is Outcome.Loading -> _state.value =
                    CoinDetailsState(isLoading = coinDetails.isLoading)
                is Outcome.Error -> _state.value =
                    CoinDetailsState(errorMessage = coinDetails.message)
            }
        }
    }
}