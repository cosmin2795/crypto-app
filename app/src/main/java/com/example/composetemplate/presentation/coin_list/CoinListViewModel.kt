package com.example.composetemplate.presentation.coin_list

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composetemplate.domain.usecase.get_coins.GetCoinListUseCase
import com.example.composetemplate.utils.Outcome
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(val coinListUseCase: GetCoinListUseCase) : ViewModel() {

    private var _state by mutableStateOf(CoinListState())

    val state: CoinListState
        get() = _state

    init {
        getCoins()
    }

    private fun getCoins() {
        viewModelScope.launch {
            coinListUseCase().collect { result ->
                when (result) {
                    is Outcome.Success -> {
                        result.data.let { coins ->
                            _state = _state.copy(coinList = coins)
                        }
                    }
                    is Outcome.Error -> {
                        _state = _state.copy(errorMessage = result.message)
                    }
                    is Outcome.Loading -> {
                        _state = _state.copy(isLoading = result.isLoading)
                    }
                }
            }
        }
    }
}