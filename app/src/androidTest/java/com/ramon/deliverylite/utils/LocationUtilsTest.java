package com.ramon.deliverylite.utils;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Locale;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class LocationUtilsTest {
    Geocoder geocoder;
    @Before
    public void setUp(){
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        geocoder=new Geocoder(context);
    }
    @Test
    public void geocodeAddressNull() {
        assertNull(LocationUtils.geocodeAddress(geocoder,null));
    }

    @Test
    public void geocodeAddressNotNull() {
        assertNotNull(LocationUtils.geocodeAddress(geocoder,"10458"));
    }

    @Test
    public void formatAddressNull() {
        Address address= new Address(Locale.US);

        assertEquals("",LocationUtils.formatAddress(address));

    }

    @Test
    public void formatAddressTestFromGeoCode(){

        Address address= LocationUtils.geocodeAddress(geocoder,"10458");

        assertEquals("New York, New York",LocationUtils.formatAddress(address));
    }
}