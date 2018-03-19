package com.example.bharat.cryptomanager.basecomponent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.bharat.cryptomanager.di.component.ActivityComponent;
import com.example.bharat.cryptomanager.di.component.DaggerActivityComponent;
import com.example.bharat.cryptomanager.di.module.ActivityModule;
import com.example.bharat.cryptomanager.pricelisting.PriceListingModule;
import com.example.bharat.cryptomanager.root.App;


public class BaseActivity extends AppCompatActivity {


    ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .applicationComponent(((App) getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .priceListingModule(new PriceListingModule()).build();

    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
