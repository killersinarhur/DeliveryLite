package com.ramon.deliverylite.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ramon.deliverylite.persistence.Datastore;
import com.ramon.deliverylite.webservice.api.DeliveryClient;

import javax.inject.Inject;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements MVPView {
    @Inject
    public DeliveryClient client;
    @Inject
    public Datastore datastore;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseApplication.getDaggerComponent().inject(this);
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
}
