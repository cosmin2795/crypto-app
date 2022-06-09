// Generated by Dagger (https://dagger.dev).
package com.example.composetemplate.presentation.coin_list;

import com.example.composetemplate.domain.usecase.get_coins.GetCoinListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinListViewModel_Factory implements Factory<CoinListViewModel> {
  private final Provider<GetCoinListUseCase> coinListUseCaseProvider;

  public CoinListViewModel_Factory(Provider<GetCoinListUseCase> coinListUseCaseProvider) {
    this.coinListUseCaseProvider = coinListUseCaseProvider;
  }

  @Override
  public CoinListViewModel get() {
    return newInstance(coinListUseCaseProvider.get());
  }

  public static CoinListViewModel_Factory create(
      Provider<GetCoinListUseCase> coinListUseCaseProvider) {
    return new CoinListViewModel_Factory(coinListUseCaseProvider);
  }

  public static CoinListViewModel newInstance(GetCoinListUseCase coinListUseCase) {
    return new CoinListViewModel(coinListUseCase);
  }
}
