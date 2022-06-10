package com.example.composetemplate.presentation.coin_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetemplate.R
import com.example.composetemplate.domain.model.Coin
import com.example.composetemplate.utils.theme.Background
import com.example.composetemplate.utils.theme.Blue
import com.example.composetemplate.utils.theme.FlameRed

@Composable
fun CoinItem(coin: Coin, goToCoinDetails: (String) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .background(Background)
            .padding(20.dp)
            .clickable { goToCoinDetails(coin.id) },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "${coin.rank}. ${coin.name} (${coin.symbol})",
            style = MaterialTheme.typography.body1,
            color = Color.White,

            )
        Text(
            text = if (coin.isActive) stringResource(R.string.active) else stringResource(R.string.inactive),
            color = if (coin.isActive) Blue else Color.Red
        )
    }
}

@Composable
fun Error(message: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = message,
            color = FlameRed,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
    }
}

@Preview
@Composable
fun PreviewCoinItem() {
    CoinItem(Coin("1", true, "Bitcoin", 1, "BTC")) {

    }
}

@Preview
@Composable
fun PreviewError() {
    Error("No Internet connection")
}