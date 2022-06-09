package com.example.composetemplate.domain.usecase.get_coins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/composetemplate/domain/usecase/get_coins/GetCoinListUseCase;", "", "coinRepository", "Lcom/example/composetemplate/domain/repository/CoinRepository;", "(Lcom/example/composetemplate/domain/repository/CoinRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/composetemplate/utils/Outcome;", "", "Lcom/example/composetemplate/domain/model/Coin;", "app_debug"})
public final class GetCoinListUseCase {
    private final com.example.composetemplate.domain.repository.CoinRepository coinRepository = null;
    
    @javax.inject.Inject()
    public GetCoinListUseCase(@org.jetbrains.annotations.NotNull()
    com.example.composetemplate.domain.repository.CoinRepository coinRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.composetemplate.utils.Outcome<java.util.List<com.example.composetemplate.domain.model.Coin>>> invoke() {
        return null;
    }
}