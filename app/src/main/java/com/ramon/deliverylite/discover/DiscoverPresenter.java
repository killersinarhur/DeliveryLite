package com.ramon.deliverylite.discover;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;

import com.ramon.deliverylite.base.BasePresenter;
import com.ramon.deliverylite.base.MVPView;
import com.ramon.deliverylite.persistence.Datastore;
import com.ramon.deliverylite.profile.UserProfile;
import com.ramon.deliverylite.utils.LocationUtils;
import com.ramon.deliverylite.webservice.api.DeliveryClient;
import com.ramon.deliverylite.webservice.api.callback.DiscoverCallBack;
import com.ramon.deliverylite.webservice.api.model.Restaurant;

import java.util.List;

import timber.log.Timber;

public class DiscoverPresenter<V extends MVPView> extends BasePresenter<V> implements DiscoverCallBack {

    private final Activity activity;
    private final Datastore datastore;
    private final DeliveryClient client;
    private final DiscoverView view;

    public DiscoverPresenter(DiscoverActivity discoverActivity, DeliveryClient client, Datastore datastore) {
        super(discoverActivity);
        this.activity = discoverActivity;
        this.view = discoverActivity;
        this.client = client;
        this.datastore = datastore;
    }

    public void onViewCreated() {
        if (datastore.getUserProfile() == null) {
            view.launchProfileActivity();
        } else {
            view.showLoadingDialog();
            UserProfile profile = datastore.getUserProfile();
            view.updateLocationString(profile.getAddressString());
           Address address= LocationUtils.geocodeAddress(new Geocoder(activity), profile.getAddressString());

            client.fetchRestList(this, address.getLatitude(), address.getLongitude(), null);
        }
    }

    @Override
    public void onListSuccess(List<Restaurant> body) {
        view.hideLoadingDialog();
        view.createView(body);

    }

    @Override
    public void onListFailure(int code, String message) {
        view.hideLoadingDialog();
        view.showErrorDialog();
    }

    public void itemClicked(Restaurant restaurant) {

    }
}
