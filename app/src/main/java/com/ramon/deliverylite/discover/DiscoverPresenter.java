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

public class DiscoverPresenter<V extends MVPView> extends BasePresenter<V> implements DiscoverCallBack {

    private final Activity activity;
    private final Datastore datastore;
    private final DeliveryClient client;
    private final DiscoverView view;
    private List<Restaurant> body;

    public DiscoverPresenter(DiscoverActivity discoverActivity, DeliveryClient client, Datastore datastore) {
        super(discoverActivity);
        this.activity = discoverActivity;
        this.view = discoverActivity;
        this.client = client;
        this.datastore = datastore;
    }

    public void onViewCreated() {
        if (datastore.getUserProfile() != null) {
            UserProfile profile = datastore.getUserProfile();
            view.updateLocationString(profile.getAddressString());
            if (body == null) {
                fetchData(profile.getAddressString());
            }
        } else if (datastore.hasDeclinedProfile()) {
            view.promptUserForLocation();

        } else {
            view.promptUserForProfile();
        }
    }

    public void fetchData(String addressString) {
        view.showLoadingDialog();
        Address address = LocationUtils.geocodeAddress(new Geocoder(activity), addressString);
        view.updateLocationString(addressString);
        client.fetchRestList(this, address.getLatitude(), address.getLongitude(), null);

    }

    @Override
    public void onListSuccess(List<Restaurant> body) {
        this.body = body;
        view.hideLoadingDialog();
        view.createView(body);

    }

    @Override
    public void onListFailure(int code, String message) {
        view.hideLoadingDialog();
        view.showErrorDialog();
    }

    public void itemClicked(Restaurant restaurant) {
        view.itemClicked(restaurant);
    }

    public void createAProfile() {
        view.launchProfileActivity();

    }

    public void askForLocation() {
        view.promptUserForLocation();
    }
}
