package com.example.composetemplate.presentation.coin_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.composetemplate.R
import com.example.composetemplate.data.remote.dto.TeamMember
import com.example.composetemplate.domain.model.CoinDetails
import com.example.composetemplate.presentation.coin_details.CoinDetailsViewModel
import com.example.composetemplate.utils.theme.Background
import com.example.composetemplate.utils.theme.ComposeTemplateTheme
import com.google.accompanist.flowlayout.FlowRow
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun CoinDetailsScreen(
    viewModel: CoinDetailsViewModel = hiltViewModel(),
    coinId: String
) {

    LaunchedEffect(key1 = null) {
        viewModel.getCoinDetails(coinId)
    }

    val state = viewModel.state.value

    state.coin?.let { coinDetails ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Background)
                .padding(20.dp)
        ) {
            item {
                Column {
                    CoinDescriptionHeader(coinDetails)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = stringResource(R.string.tags),
                        style = MaterialTheme.typography.h5,
                        color = Color.White,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    FlowRow(
                        crossAxisSpacing = 10.dp,
                        mainAxisSpacing = 5.dp,
                    ) {
                        coinDetails.tags.forEach { tag ->
                            CoinTag(tag)
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = stringResource(R.string.team_members),
                        style = MaterialTheme.typography.h5,
                        color = Color.White,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
            itemsIndexed(coinDetails.team) { index, member ->
                TeamMemberItem(teamMember = member)
                if (index != coinDetails.team.size - 1)
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Gray)
                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCoinList() {
    ComposeTemplateTheme {
        val coin = CoinDetails( // for testing
            "1", "CoinBit",
            "Bitcoin is a cryptocurrency and worldwide payment system. It is the first decentralized digital currency, as the system works without a central bank or single administrator.",
            "BTC",
            1,
            false,
            listOf(
                "Money",
                "SmartContracts",
                "Digital Gold",
                "Mining",
                "Btc",
                "Satoshi",
                "SmartContracts",
                "Digital Gold",
                "Mining",
                "Btc",
                "Satoshi"
            ),
            listOf(
                TeamMember("1", "JAck", "CTO"), TeamMember("1", "Sparrow", "Developer"),
                TeamMember("1", "Jacobs", "QA Officer")
            )
        )
    }
}