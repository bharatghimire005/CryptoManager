package com.example.bharat.cryptomanager.repository.network;


import com.example.bharat.cryptomanager.repository.network.koinex.KoinexService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiModule {

    @Singleton
    @Provides
    public KoinexService provideKoinexApi(Retrofit retrofit) {
        return new KoinexService(retrofit);
    }

}
