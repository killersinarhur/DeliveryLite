package com.ramon.deliverylite.utils;

import android.location.Address;
import android.location.Geocoder;
import android.support.annotation.Nullable;

import java.io.IOException;
import java.util.List;

import timber.log.Timber;

public class LocationUtils {

    @Nullable
    public static Address geocodeAddress(Geocoder geocoder, String location) {
        List<Address> list = null;
        try {
            list = geocoder.getFromLocationName(location, 1);
        } catch (IOException e) {
            Timber.e(e);
        }
        if (null != list && !list.isEmpty()) {
            Timber.d("Got an address");
            return list.get(0);
        }

        Timber.d("returning Null");
        return null;
    }

    public static String formatAddress(Address address) {
        String strAddress;
        StringBuilder stringBuilder = new StringBuilder();

        if (address.getLocality() != null && !address.getLocality().equals("")) {
            stringBuilder.append(address.getLocality());
        }

        if (address.getAdminArea() != null && !address.getAdminArea().equals("")) {
            if (stringBuilder.length() > 0) stringBuilder.append(", ");
            stringBuilder.append(address.getAdminArea());
        }


        if (address.getPostalCode() != null && !address.getPostalCode().equals("")) {
            if (stringBuilder.length() > 0) stringBuilder.append(", ");
            stringBuilder.append(address.getAdminArea());
        }

        if (stringBuilder.length() == 0) {
            for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(address.getAddressLine(i));
            }
        }

        strAddress = stringBuilder.toString();
        if (strAddress.equals("null")) strAddress = "";

        return strAddress;
    }
}
