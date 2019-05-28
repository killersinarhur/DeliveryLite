package com.ramon.deliverylite.profile;

import android.location.Address;

import timber.log.Timber;

public class UserProfile {

    private Address address;
    private String phone;
    private String email;
    private String addressString;
    private String name;

    @Override
    public String toString() {
        return new StringBuilder().append(name).append(phone).append(email).append(addressString).toString();
    }

    public Address getAddress() {
        Timber.d(address.toString());
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
