package com.ramon.deliverylite.webservice.api;

import com.ramon.deliverylite.webservice.api.model.Restaurant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DeliveryApi {

    @GET("v2/restaurant/")
    Call<List<Restaurant>> getRestaurantList(@Query("lat") double lat, @Query("lng") double lng, @Query("limit")  Integer limit);

    @GET("v2/restaurant/{restid}/")
    Call<Restaurant> getRestaurant(@Path("restid") int restId);
}
