package com.example.composetemplate.presentation.coin_details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/composetemplate/presentation/coin_details/CoinDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "getCoinDetailsUseCase", "Lcom/example/composetemplate/domain/usecase/get_coin/GetCoinDetailsUseCase;", "(Lcom/example/composetemplate/domain/usecase/get_coin/GetCoinDetailsUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/composetemplate/presentation/coin_details/CoinDetailsState;", "getGetCoinDetailsUseCase", "()Lcom/example/composetemplate/domain/usecase/get_coin/GetCoinDetailsUseCase;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getCoinDetails", "", "coinId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CoinDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.composetemplate.domain.usecase.get_coin.GetCoinDetailsUseCase getCoinDetailsUseCase = null;
    private final androidx.compose.runtime.MutableState<com.example.composetemplate.presentation.coin_details.CoinDetailsState> _state = null;
    
    @javax.inject.Inject()
    public CoinDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.composetemplate.domain.usecase.get_coin.GetCoinDetailsUseCase getCoinDetailsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.composetemplate.domain.usecase.get_coin.GetCoinDetailsUseCase getGetCoinDetailsUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.example.composetemplate.presentation.coin_details.CoinDetailsState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}