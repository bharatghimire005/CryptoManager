package com.example.bharat.cryptomanager.di.component;

import com.example.bharat.cryptomanager.basecomponent.BaseActivity;
import com.example.bharat.cryptomanager.di.PerActivity;
import com.example.bharat.cryptomanager.di.module.ActivityModule;
import com.example.bharat.cryptomanager.pricelisting.MainActivity;
import com.example.bharat.cryptomanager.pricelisting.PriceListingModule;

import com.example.bharat.cryptomanager.root.ApplicationComponent;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class,
        modules = {ActivityModule.class, PriceListingModule.class})
public interface ActivityComponent {


    void inject(MainActivity activity);
}
