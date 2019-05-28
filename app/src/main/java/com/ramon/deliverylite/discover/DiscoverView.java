package com.ramon.deliverylite.discover;

import com.ramon.deliverylite.base.MVPView;
import com.ramon.deliverylite.webservice.api.model.Restaurant;

import java.util.List;

public interface DiscoverView extends MVPView {
    void launchProfileActivity();

    void createView(List<Restaurant> body);

    void updateLocationString(String addressString);
}
