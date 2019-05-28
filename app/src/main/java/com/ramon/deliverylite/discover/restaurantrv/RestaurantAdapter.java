package com.ramon.deliverylite.discover.restaurantrv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.ramon.deliverylite.discover.DiscoverPresenter;
import com.ramon.deliverylite.webservice.api.model.Restaurant;


import java.util.List;

import butterknife.OnClick;

public class RestaurantAdapter extends RecyclerView.Adapter {

    private final List<Restaurant> body;
    private final DiscoverPresenter presenter;

    public RestaurantAdapter(List<Restaurant> body, DiscoverPresenter presenter) {
        this.body=body;
        this.presenter=presenter;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return RestaurantViewHolder.inflate(viewGroup);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof RestaurantViewHolder){
            ((RestaurantViewHolder) viewHolder).bind(body.get(i), view-> presenter.itemClicked(body.get(i)));
        }

    }

    @Override
    public int getItemCount() {
        return body.size();
    }



}
