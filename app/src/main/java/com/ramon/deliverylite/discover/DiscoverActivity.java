package com.ramon.deliverylite.discover;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
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
    @BindView(R.id.discover_rv_restaur)
    RecyclerView restaurantRV;
    @BindView(R.id.discover_tv_location)
    TextView locationText;

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

    }

    @Override
    public void hideLoadingDialog() {

    }

    @Override
    public void showErrorDialog() {

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
        restaurantRV.setAdapter(new RestaurantAdapter(body,presenter));
    }

    @Override
    public void updateLocationString(String addressString) {
        locationText.setText(getString(R.string.address_string,addressString));
    }
}
