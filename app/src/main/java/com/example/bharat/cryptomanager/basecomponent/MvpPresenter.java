package com.example.bharat.cryptomanager.basecomponent;

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
    void onDetach();
    void onError(Throwable error);
}
