package com.example.composetemplate.presentation

import androidx.lifecycle.SavedStateHandle
import com.example.composetemplate.presentation.destinations.CoinDetailsScreenDestination

inline fun <reified T> SavedStateHandle.navArgs(): T {
    return navArgs(T::class.java, this)
}

@Suppress("UNCHECKED_CAST")
fun <T> navArgs(argsClass: Class<T>, savedStateHandle: SavedStateHandle): T {
    return when (argsClass) {
		CoinDetailsScreenDestination.NavArgs::class.java -> CoinDetailsScreenDestination.argsFrom(savedStateHandle) as T
        else -> error("Class ${argsClass} is not a navigation arguments class!")
    }
}
