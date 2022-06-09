package com.example.composetemplate.presentation.coin_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/composetemplate/presentation/coin_details/CoinDetailsState;", "", "isLoading", "", "coin", "Lcom/example/composetemplate/domain/model/CoinDetails;", "errorMessage", "", "(ZLcom/example/composetemplate/domain/model/CoinDetails;Ljava/lang/String;)V", "getCoin", "()Lcom/example/composetemplate/domain/model/CoinDetails;", "getErrorMessage", "()Ljava/lang/String;", "()Z", "app_debug"})
public final class CoinDetailsState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.example.composetemplate.domain.model.CoinDetails coin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errorMessage = null;
    
    public CoinDetailsState() {
        super();
    }
    
    public CoinDetailsState(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.example.composetemplate.domain.model.CoinDetails coin, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.composetemplate.domain.model.CoinDetails getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}