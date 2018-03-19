package com.example.bharat.cryptomanager.pricelisting;


import com.example.bharat.cryptomanager.di.PerActivity;
import com.example.bharat.cryptomanager.repository.network.koinex.KoinexService;

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

