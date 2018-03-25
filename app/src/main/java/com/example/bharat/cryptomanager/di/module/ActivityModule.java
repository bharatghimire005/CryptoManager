package com.example.bharat.cryptomanager.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.bharat.cryptomanager.di.ActivityContext;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }


    Context provideContext() {
        return mActivity;
    }


    @Provides
    Activity provideActivity() {
        return mActivity;
    }


}
