package com.example.composetemplate.presentation

import com.example.composetemplate.presentation.destinations.*
import com.ramcosta.composedestinations.spec.*

/**
 * Class generated if any Composable is annotated with `@Destination`.
 * It aggregates all [TypedDestination]s in their [NavGraph]s.
 */
object NavGraphs {

    val root = NavGraph(
        route = "root",
        startRoute = CoinListScreenDestination,
        destinations = listOf(
            CoinDetailsScreenDestination,
			CoinListScreenDestination
        )
    )
}