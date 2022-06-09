package com.example.composetemplate.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/composetemplate/data/remote/CoinService;", "", "getAllCoins", "", "Lcom/example/composetemplate/data/remote/dto/CoinDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinDetails", "Lcom/example/composetemplate/data/remote/dto/CoinDetailsDto;", "coin", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CoinService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/coins")
    public abstract java.lang.Object getAllCoins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.composetemplate.data.remote.dto.CoinDto>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/coins/{coin}")
    public abstract java.lang.Object getCoinDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "coin")
    java.lang.String coin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.composetemplate.data.remote.dto.CoinDetailsDto> continuation);
}