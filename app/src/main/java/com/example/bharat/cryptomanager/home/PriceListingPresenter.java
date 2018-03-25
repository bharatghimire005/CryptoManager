package com.example.bharat.cryptomanager.home;

import android.util.Log;

import com.example.bharat.cryptomanager.repository.network.koinex.KoinexService;
import com.example.bharat.cryptomanager.repository.network.model.KoinexResponse;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;


public class PriceListingPresenter implements PriceListContract.Presenter {
    private static final String TAG = "PriceListingPresenter";
    private PriceListContract.View view;
    private CompositeDisposable compositeDisposable;
    private KoinexService koinexService;

    @Inject
    public PriceListingPresenter(CompositeDisposable compositeDisposable, KoinexService koinexService) {
        this.koinexService = koinexService;
        this.compositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(PriceListContract.View view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        view = null;
        compositeDisposable.dispose();
    }

    @Override
    public void onError(Throwable error) {
        Log.d(TAG, error.toString());
    }

    @Override
    public void getKoinexData() {
        compositeDisposable.add(koinexService.getKoinexTickerData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(this::onKoinexResponse, this::onError));
    }

    @Override
    public void onKoinexResponse(KoinexResponse koinexResponse) {
        Log.d(TAG, koinexResponse.toString());
    }
}
