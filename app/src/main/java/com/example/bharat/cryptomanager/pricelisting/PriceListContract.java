package com.example.bharat.cryptomanager.pricelisting;

import com.example.bharat.cryptomanager.basecomponent.MvpPresenter;
import com.example.bharat.cryptomanager.basecomponent.MvpView;
import com.example.bharat.cryptomanager.repository.network.koinex.KoinexService;
import com.example.bharat.cryptomanager.repository.network.model.KoinexResponse;

public interface PriceListContract {

    interface View extends MvpView {

    }

    interface Presenter extends MvpPresenter<View> {
        void getKoinexData();

        void onKoinexResponse(KoinexResponse koinexResponse);
    }
}
