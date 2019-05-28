package com.ramon.deliverylite.webservice.api;

import android.app.Application;

import com.ramon.deliverylite.webservice.api.callback.DiscoverCallBack;
import com.ramon.deliverylite.webservice.api.callback.RestaurantCallBack;
import com.ramon.deliverylite.webservice.api.model.Restaurant;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class DeliveryClient {
    private final Application app;
    private final DeliveryApi client;

    public DeliveryClient(Application app, DeliveryApi client) {
        this.app = app;
        this.client = client;
    }

    public void fetchRestList(DiscoverCallBack callBack, double lat, double lng, Integer limit) {
        client.getRestaurantList(lat, lng, limit).enqueue(new Callback<List<Restaurant>>() {
            @Override
            public void onResponse(Call<List<Restaurant>> call, Response<List<Restaurant>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callBack.onListSuccess(response.body());
                } else {
                    Timber.d("ListFetchFailed: %s", response.message());
                    callBack.onListFailure(response.code(), response.message());
                }

            }

            @Override
            public void onFailure(Call<List<Restaurant>> call, Throwable t) {
                Timber.d("ListFetchFailed: %s", t.getMessage());
                callBack.onListFailure(-1, t.getMessage());
            }
        });
    }

    public void getRest(RestaurantCallBack callBack, int restId) {
        client.getRestaurant(restId).enqueue(new Callback<Restaurant>() {
            @Override
            public void onResponse(Call<Restaurant> call, Response<Restaurant> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callBack.onRestSuccess(response.body());
                } else {
                    Timber.d("RestFetchFailed: %s", response.message());
                    callBack.onRestFailure(response.code(), response.message());
                }
            }

            @Override
            public void onFailure(Call<Restaurant> call, Throwable t) {
                Timber.d("RestFetchFailed: %s", t.getMessage());
                callBack.onRestFailure(-1, t.getMessage());
            }
        });
    }
}
