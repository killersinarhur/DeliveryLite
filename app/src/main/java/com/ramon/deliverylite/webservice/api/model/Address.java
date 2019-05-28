
package com.ramon.deliverylite.webservice.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Address {

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("printable_address")
    @Expose
    private String printableAddress;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param street
     * @param state
     * @param lng
     * @param lat
     * @param printableAddress
     * @param city
     */
    public Address(String city, String state, String street, Double lat, Double lng, String printableAddress) {
        super();
        this.city = city;
        this.state = state;
        this.street = street;
        this.lat = lat;
        this.lng = lng;
        this.printableAddress = printableAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getPrintableAddress() {
        return printableAddress;
    }

    public void setPrintableAddress(String printableAddress) {
        this.printableAddress = printableAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("city", city).append("state", state).append("street", street).append("lat", lat).append("lng", lng).append("printableAddress", printableAddress).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(street).append(state).append(lng).append(lat).append(printableAddress).append(city).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(street, rhs.street).append(state, rhs.state).append(lng, rhs.lng).append(lat, rhs.lat).append(printableAddress, rhs.printableAddress).append(city, rhs.city).isEquals();
    }

}
