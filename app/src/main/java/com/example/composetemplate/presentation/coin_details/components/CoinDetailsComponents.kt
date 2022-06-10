package com.example.composetemplate.presentation.coin_details.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetemplate.data.remote.model.TeamMember
import com.example.composetemplate.domain.model.CoinDetails
import com.example.composetemplate.utils.theme.Background
import com.example.composetemplate.utils.theme.Blue
import com.example.composetemplate.utils.theme.ComposeTemplateTheme

@Composable
fun CoinDescriptionHeader(coin: CoinDetails) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Background)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "${coin.rank}. ${coin.name} (${coin.symbol})",
                style = MaterialTheme.typography.h6,
                color = Blue
            )
            Text(
                text = if (coin.isActive) "active" else "inactive",
                color = if (coin.isActive) Blue else Color.Red
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = coin.description,
            modifier = Modifier
                .fillMaxWidth(),
            color = Color.Gray
        )
    }
}

@Composable
fun CoinTag(tag: String) {
    Box(
        modifier = Modifier
            .border(border = BorderStroke(2.dp, Blue), shape = MaterialTheme.shapes.medium)
            .clip(RoundedCornerShape(30.dp))
            .background(Background)
    ) {
        Text(
            text = tag,
            modifier = Modifier.padding(10.dp),
            color = Blue
        )
    }
}

@Composable
fun TeamMemberItem(teamMember: TeamMember) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Background)
    ) {
        Spacer(modifier = Modifier.height(3.dp))
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.h5,
            color = Blue,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.subtitle2,
            color = Blue,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
        )
        Spacer(modifier = Modifier.height(3.dp))
    }
}

@Preview
@Composable
fun PreviewCoinTag() {
    ComposeTemplateTheme {
        CoinTag("Goo")
    }
}

@Preview
@Composable
fun PreviewTeamMemberItem() {
    ComposeTemplateTheme {
        TeamMemberItem(teamMember = TeamMember("1", "sadas", "das"))
    }
}

@Preview
@Composable
fun PreviewCoinDescriptionHeader() {
    ComposeTemplateTheme {
        val coin = CoinDetails(
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
        CoinDescriptionHeader(coin)
    }
}