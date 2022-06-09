package com.example.composetemplate.utils

sealed class Outcome<T> {
    class Success<T>(val data: T) : Outcome<T>()
    class Error<T>(val message: String) : Outcome<T>()
    class Loading<T>(val isLoading: Boolean) : Outcome<T>()
}
