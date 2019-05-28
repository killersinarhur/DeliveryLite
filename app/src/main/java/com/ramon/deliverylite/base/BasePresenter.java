package com.ramon.deliverylite.base;

import android.app.Activity;

import javax.inject.Inject;

public class BasePresenter<V extends MVPView> implements MVPPresenter<V> {

    private final Activity activity;
    private V mvpView;

    @Inject
    public BasePresenter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mvpView = null;
    }

    public boolean isViewAttached() {
        return mvpView != null;
    }

    private V getMvpView() {
        return mvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachtedException();
    }

    public static class MvpViewNotAttachtedException extends RuntimeException {
            public MvpViewNotAttachtedException(){
                super("YOU FORGOT TO ATTACH");
            }
    }
}
