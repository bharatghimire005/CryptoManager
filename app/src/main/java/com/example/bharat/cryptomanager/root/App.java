package com.example.bharat.cryptomanager.root;

import android.app.Application;

import com.example.bharat.cryptomanager.repository.network.ApiModule;
import com.example.bharat.cryptomanager.repository.network.NetModule;

public class App extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .netModule(new NetModule())
                .applicationModule(new ApplicationModule(this))
                .apiModule(new ApiModule())
                .build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
