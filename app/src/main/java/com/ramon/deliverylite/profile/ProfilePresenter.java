package com.ramon.deliverylite.profile;

import android.app.Activity;

import com.ramon.deliverylite.base.BasePresenter;
import com.ramon.deliverylite.base.MVPView;
import com.ramon.deliverylite.persistence.Datastore;

public class ProfilePresenter<V extends MVPView> extends BasePresenter<V> {

    private Activity activity;
    private ProfileView view;
    private UserProfile userProfile;
    private Datastore datastore;

    public ProfilePresenter(ProfileActivity activity, Datastore datastore, UserProfile userProfile) {
        super(activity);
        this.activity = activity;
        this.view = activity;
        this.datastore = datastore;
        this.userProfile = userProfile;
    }

    public void onViewCreated() {
        view.initializeView(userProfile);
    }

    public void saveInstance(String name, String address, String email, String phoneNumber) {
        persistUserProfile(name, address, email, phoneNumber);
    }

    public void persistUserProfile(String name, String address, String email, String phoneNumber) {
        userProfile.setName(name);
        userProfile.setAddressString(address);
        userProfile.setEmail(email);
        userProfile.setPhone(phoneNumber);


        datastore.persistUserProfile(userProfile);

        view.closeActivity();

    }
}
