package com.example.composetemplate.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/composetemplate/domain/repository/CoinRepository;", "", "getCoins", "", "Lcom/example/composetemplate/data/remote/dto/CoinDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinsByName", "Lcom/example/composetemplate/data/remote/dto/CoinDetailsDto;", "coinId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CoinRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCoins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.composetemplate.data.remote.dto.CoinDto>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCoinsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.composetemplate.data.remote.dto.CoinDetailsDto> continuation);
}