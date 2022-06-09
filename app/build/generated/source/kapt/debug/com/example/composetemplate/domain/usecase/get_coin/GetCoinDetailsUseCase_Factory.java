// Generated by Dagger (https://dagger.dev).
package com.example.composetemplate.domain.usecase.get_coin;

import com.example.composetemplate.domain.repository.CoinRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetCoinDetailsUseCase_Factory implements Factory<GetCoinDetailsUseCase> {
  private final Provider<CoinRepository> coinRepositoryProvider;

  public GetCoinDetailsUseCase_Factory(Provider<CoinRepository> coinRepositoryProvider) {
    this.coinRepositoryProvider = coinRepositoryProvider;
  }

  @Override
  public GetCoinDetailsUseCase get() {
    return newInstance(coinRepositoryProvider.get());
  }

  public static GetCoinDetailsUseCase_Factory create(
      Provider<CoinRepository> coinRepositoryProvider) {
    return new GetCoinDetailsUseCase_Factory(coinRepositoryProvider);
  }

  public static GetCoinDetailsUseCase newInstance(CoinRepository coinRepository) {
    return new GetCoinDetailsUseCase(coinRepository);
  }
}