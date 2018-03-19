package com.example.bharat.cryptomanager.root;


import com.example.bharat.cryptomanager.pricelisting.MainActivity;
import com.example.bharat.cryptomanager.pricelisting.PriceListingModule;
import com.example.bharat.cryptomanager.repository.network.ApiModule;
import com.example.bharat.cryptomanager.repository.network.NetModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetModule.class,
        ApplicationModule.class,
        ApiModule.class
        /*, PriceListingModule.class*/})
public interface ApplicationComponent {

    void inject(App app);
}
