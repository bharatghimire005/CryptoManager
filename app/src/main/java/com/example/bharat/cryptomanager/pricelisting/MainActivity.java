package com.example.bharat.cryptomanager.pricelisting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bharat.cryptomanager.R;
import com.example.bharat.cryptomanager.basecomponent.BaseActivity;
import com.example.bharat.cryptomanager.repository.network.koinex.KoinexService;
import com.example.bharat.cryptomanager.root.App;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements PriceListContract.View {


    @Inject
    PriceListContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        //((App) getApplication()).getApplicationComponent().inject(this);
        presenter.onAttach(this);
        presenter.getKoinexData();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage(int resId) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    @Override
    public void hideKeyboard() {

    }
}
