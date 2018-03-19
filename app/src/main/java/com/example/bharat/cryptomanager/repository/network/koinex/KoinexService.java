package com.example.bharat.cryptomanager.repository.network.koinex;


import com.example.bharat.cryptomanager.repository.network.model.KoinexResponse;


import javax.inject.Inject;

import io.reactivex.Observable;

import retrofit2.Retrofit;


public class KoinexService {

    private KoinexApi koinexApi;

    public KoinexService(Retrofit retrofit) {
        koinexApi = retrofit.create(KoinexApi.class);
    }


    public Observable<KoinexResponse> getKoinexTickerData() {
        return koinexApi.getKoinexTickerResponse();
    }
}
