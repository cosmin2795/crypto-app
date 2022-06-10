package com.example.composetemplate.presentation.coin_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.composetemplate.presentation.coin_list.CoinListViewModel
import com.example.composetemplate.presentation.destinations.CoinDetailsScreenDestination
import com.example.composetemplate.utils.theme.Background
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun CoinListScreen(
    destinationsNavigator: DestinationsNavigator,
    viewModel: CoinListViewModel = hiltViewModel()
) {
    val state = viewModel.state
    Box(modifier = Modifier.fillMaxSize()) {
        if (state.errorMessage.isNotEmpty()) {
            Error(state.errorMessage)
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Background)
            ) {
                items(state.coinList) { coin ->
                    CoinItem(coin = coin) { coinId ->
                        destinationsNavigator.navigate(CoinDetailsScreenDestination(coinId))
                    }
                }
            }
        }
    }
}