package com.example.composetemplate;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = CoinApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface CoinApp_GeneratedInjector {
  void injectCoinApp(CoinApp coinApp);
}
