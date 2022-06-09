// Generated by Dagger (https://dagger.dev).
package com.example.composetemplate.di;

import com.example.composetemplate.data.remote.CoinService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCoinServiceFactory implements Factory<CoinService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideCoinServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CoinService get() {
    return provideCoinService(retrofitProvider.get());
  }

  public static AppModule_ProvideCoinServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideCoinServiceFactory(retrofitProvider);
  }

  public static CoinService provideCoinService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCoinService(retrofit));
  }
}