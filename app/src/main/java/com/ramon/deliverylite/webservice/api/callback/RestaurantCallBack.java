package com.ramon.deliverylite.webservice.api.callback;

import com.ramon.deliverylite.webservice.api.model.Restaurant;

public interface RestaurantCallBack {
    void onRestSuccess(Restaurant body);

    void onRestFailure(int code, String message);
}
