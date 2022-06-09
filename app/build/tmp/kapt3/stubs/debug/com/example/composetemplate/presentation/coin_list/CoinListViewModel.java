package com.example.composetemplate.presentation.coin_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/example/composetemplate/presentation/coin_list/CoinListViewModel;", "Landroidx/lifecycle/ViewModel;", "coinListUseCase", "Lcom/example/composetemplate/domain/usecase/get_coins/GetCoinListUseCase;", "(Lcom/example/composetemplate/domain/usecase/get_coins/GetCoinListUseCase;)V", "<set-?>", "Lcom/example/composetemplate/presentation/coin_list/CoinListState;", "_state", "get_state", "()Lcom/example/composetemplate/presentation/coin_list/CoinListState;", "set_state", "(Lcom/example/composetemplate/presentation/coin_list/CoinListState;)V", "_state$delegate", "Landroidx/compose/runtime/MutableState;", "getCoinListUseCase", "()Lcom/example/composetemplate/domain/usecase/get_coins/GetCoinListUseCase;", "state", "getState", "getCoins", "", "app_debug"})
public final class CoinListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.composetemplate.domain.usecase.get_coins.GetCoinListUseCase coinListUseCase = null;
    private final androidx.compose.runtime.MutableState _state$delegate = null;
    
    @javax.inject.Inject()
    public CoinListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.composetemplate.domain.usecase.get_coins.GetCoinListUseCase coinListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.composetemplate.domain.usecase.get_coins.GetCoinListUseCase getCoinListUseCase() {
        return null;
    }
    
    private final com.example.composetemplate.presentation.coin_list.CoinListState get_state() {
        return null;
    }
    
    private final void set_state(com.example.composetemplate.presentation.coin_list.CoinListState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.composetemplate.presentation.coin_list.CoinListState getState() {
        return null;
    }
    
    private final void getCoins() {
    }
}