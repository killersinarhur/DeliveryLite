package com.ramon.deliverylite.discover;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ramon.deliverylite.R;
import com.ramon.deliverylite.base.BaseActivity;
import com.ramon.deliverylite.discover.restaurantrv.RestaurantAdapter;
import com.ramon.deliverylite.profile.ProfileActivity;
import com.ramon.deliverylite.webservice.api.model.Restaurant;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DiscoverActivity extends BaseActivity implements DiscoverView {
    private static final String RV_BUNDLE_STATE = "RV_BUNDLE_STATE";
    @BindView(R.id.discover_rv_restaur)
    RecyclerView restaurantRV;
    @BindView(R.id.discover_tv_location)
    TextView locationText;
    @BindView(R.id.discover_loading_spinner)
    ProgressBar progressBar;

    private DiscoverPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new DiscoverPresenter(this, client, datastore);
        presenter.onAttach(DiscoverActivity.this);
    }

    @Override
    public void showLoadingDialog() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoadingDialog() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onViewCreated();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }

    @Override
    public void launchProfileActivity() {
        ProfileActivity.launch(this);
    }

    @Override
    public void createView(List<Restaurant> body) {
        restaurantRV.setAdapter(new RestaurantAdapter(body, presenter));
    }

    @Override
    public void updateLocationString(String addressString) {
        locationText.setText(getString(R.string.address_string, addressString));
    }

    @Override
    public void itemClicked(Restaurant restaurant) {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(RV_BUNDLE_STATE, restaurantRV.getLayoutManager().onSaveInstanceState());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        restaurantRV = savedInstanceState.getParcelable(RV_BUNDLE_STATE);
    }
}
