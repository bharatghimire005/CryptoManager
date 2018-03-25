package com.example.bharat.cryptomanager.root;


import android.content.Context;

import com.example.bharat.cryptomanager.repository.network.ApiModule;
import com.example.bharat.cryptomanager.repository.network.NetModule;
import com.example.bharat.cryptomanager.repository.network.koinex.KoinexService;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {NetModule.class,
        ApplicationModule.class,
        ApiModule.class
        /*, PriceListingModule.class*/})
public interface ApplicationComponent {

    void inject(App app);

    Retrofit provideRetrofit();

    OkHttpClient provideClient();

    Context provideApplicationContext();

    KoinexService provideKoinexApi();

}
