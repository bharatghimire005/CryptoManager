package com.example.bharat.cryptomanager.main;


import com.example.bharat.cryptomanager.di.PerActivity;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class PriceListingModule {

    @Provides
    @PerActivity
    public PriceListContract.Presenter providePriceListPresenter(PriceListingPresenter priceListingPresenter) {
        return priceListingPresenter;
    }

    @Provides
    @PerActivity
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

}

