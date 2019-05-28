package com.ramon.deliverylite.base;

public interface MVPPresenter<V extends MVPView> {
    void onAttach(V mvpView);
    void onDetach();
}
