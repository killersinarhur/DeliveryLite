package com.ramon.deliverylite.di;


import com.ramon.deliverylite.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DeliveryModule.class})
public interface DeliveryComponent {

    void inject(BaseActivity baseActivity);
}
