package com.example.bharat.cryptomanager.repository.network.koinex;

import com.example.bharat.cryptomanager.repository.network.model.KoinexResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface KoinexApi {


    @GET("ticker")
    Observable<KoinexResponse> getKoinexTickerResponse();
}
