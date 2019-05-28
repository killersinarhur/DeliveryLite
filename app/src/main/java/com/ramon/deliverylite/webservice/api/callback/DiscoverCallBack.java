package com.ramon.deliverylite.webservice.api.callback;

import com.ramon.deliverylite.webservice.api.model.Restaurant;

import java.util.List;

public interface DiscoverCallBack {
    void onListSuccess(List<Restaurant> body);

    void onListFailure(int code, String message);
}
