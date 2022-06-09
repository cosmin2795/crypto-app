package com.example.composetemplate.presentation.destinations;

import java.lang.System;

/**
 * DirectionDestination is a sealed version of [DirectionDestinationSpec]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/composetemplate/presentation/destinations/DirectionDestination;", "Lcom/example/composetemplate/presentation/destinations/TypedDestination;", "", "Lcom/ramcosta/composedestinations/spec/DirectionDestinationSpec;", "Lcom/example/composetemplate/presentation/destinations/CoinListScreenDestination;", "app_debug"})
public abstract interface DirectionDestination extends com.example.composetemplate.presentation.destinations.TypedDestination<kotlin.Unit>, com.ramcosta.composedestinations.spec.DirectionDestinationSpec {
    
    /**
     * DirectionDestination is a sealed version of [DirectionDestinationSpec]
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.composetemplate.presentation.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
        }
        
        @java.lang.Override()
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.composetemplate.presentation.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        androidx.navigation.NavBackStackEntry navBackStackEntry) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.List<androidx.navigation.NamedNavArgument> getArguments(@org.jetbrains.annotations.NotNull()
        com.example.composetemplate.presentation.destinations.DirectionDestination $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.List<androidx.navigation.NavDeepLink> getDeepLinks(@org.jetbrains.annotations.NotNull()
        com.example.composetemplate.presentation.destinations.DirectionDestination $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static com.ramcosta.composedestinations.spec.DestinationStyle getStyle(@org.jetbrains.annotations.NotNull()
        com.example.composetemplate.presentation.destinations.DirectionDestination $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static com.ramcosta.composedestinations.spec.Direction invoke(@org.jetbrains.annotations.NotNull()
        com.example.composetemplate.presentation.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        kotlin.Unit navArgs) {
            return null;
        }
    }
}