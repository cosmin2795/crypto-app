package com.example.composetemplate.presentation.destinations

import androidx.annotation.RestrictTo
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.spec.*
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.navDeepLink
import com.example.composetemplate.presentation.coin_details.components.CoinDetailsScreen
import com.example.composetemplate.presentation.destinations.CoinDetailsScreenDestination.NavArgs
import com.ramcosta.composedestinations.navargs.primitives.DestinationsStringNavType

object CoinDetailsScreenDestination : TypedDestination<CoinDetailsScreenDestination.NavArgs> {
    
    override fun invoke(navArgs: NavArgs): Direction = with(navArgs) {
        invoke(coinId)
    }
     
    operator fun invoke(
		coinId: String,
    ): Direction {
        return object : Direction {
            override val route = "$baseRoute" + 
					"/${DestinationsStringNavType.serializeValue("coinId", coinId)}"
        }
    }
    
    @get:RestrictTo(RestrictTo.Scope.SUBCLASSES)
    override val baseRoute = "coin_details_screen"

    override val route = "$baseRoute/{coinId}"
    
	override val arguments get() = listOf(
		navArgument("coinId") {
			type = DestinationsStringNavType
		}
	)

    @Composable
    override fun DestinationScope<NavArgs>.Content(
		dependenciesContainerBuilder: @Composable DependenciesContainerBuilder<NavArgs>.() -> Unit
    ) {
		val (coinId) = navArgs
		CoinDetailsScreen(
			coinId = coinId
		)
    }
                    
	override fun argsFrom(navBackStackEntry: NavBackStackEntry): NavArgs {
	    return NavArgs(
			coinId = DestinationsStringNavType.get(navBackStackEntry, "coinId") ?: throw RuntimeException("'coinId' argument is mandatory, but was not present!"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): NavArgs {
	    return NavArgs(
			coinId = DestinationsStringNavType.get(savedStateHandle, "coinId") ?: throw RuntimeException("'coinId' argument is mandatory, but was not present!"),
	    )
	}

	data class NavArgs(
		val coinId: String,
	)
}