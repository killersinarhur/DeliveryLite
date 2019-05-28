package com.ramon.deliverylite.base;

import android.app.Application;


import com.ramon.deliverylite.BuildConfig;
import com.ramon.deliverylite.di.DaggerDeliveryComponent;
import com.ramon.deliverylite.di.DeliveryComponent;
import com.ramon.deliverylite.di.DeliveryModule;

import timber.log.Timber;

public class BaseApplication extends Application {

    private static DeliveryComponent daggerComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        buildDaggerComponent();
        initTimber();
    }

    private void initTimber() {
        if (BuildConfig.LOGGING_ENABLED){
            Timber.plant(new Timber.DebugTree());
        }
    }

    public void buildDaggerComponent() {
        daggerComponent= DaggerDeliveryComponent.builder()
                .deliveryModule(new DeliveryModule(this))
                .build();
    }
    public static DeliveryComponent getDaggerComponent() {
        return daggerComponent;
    }
}
