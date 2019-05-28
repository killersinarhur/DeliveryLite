package com.ramon.deliverylite.profile;

import android.location.Address;

import timber.log.Timber;

public class UserProfile {

    private Address address;
    private String phone;
    private String email;
    private String addressString;

    @Override
    public String toString() {
        return new StringBuilder().append(name).append(phone).append(email).append(addressString).toString();
    }

    private String name;

    public Address getAddress() {
        Timber.d(address.toString());
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
