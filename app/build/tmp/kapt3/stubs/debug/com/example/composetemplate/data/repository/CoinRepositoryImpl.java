package com.example.composetemplate.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/composetemplate/data/repository/CoinRepositoryImpl;", "Lcom/example/composetemplate/domain/repository/CoinRepository;", "coinService", "Lcom/example/composetemplate/data/remote/CoinService;", "(Lcom/example/composetemplate/data/remote/CoinService;)V", "getCoins", "", "Lcom/example/composetemplate/data/remote/dto/CoinDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoinsByName", "Lcom/example/composetemplate/data/remote/dto/CoinDetailsDto;", "coinId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CoinRepositoryImpl implements com.example.composetemplate.domain.repository.CoinRepository {
    private final com.example.composetemplate.data.remote.CoinService coinService = null;
    
    @javax.inject.Inject()
    public CoinRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.composetemplate.data.remote.CoinService coinService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCoins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.composetemplate.data.remote.dto.CoinDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCoinsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.composetemplate.data.remote.dto.CoinDetailsDto> continuation) {
        return null;
    }
}