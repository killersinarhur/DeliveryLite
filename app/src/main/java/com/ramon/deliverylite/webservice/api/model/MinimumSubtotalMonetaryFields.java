
package com.ramon.deliverylite.webservice.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MinimumSubtotalMonetaryFields {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("display_string")
    @Expose
    private String displayString;
    @SerializedName("unit_amount")
    @Expose
    private Object unitAmount;
    @SerializedName("decimal_places")
    @Expose
    private Integer decimalPlaces;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MinimumSubtotalMonetaryFields() {
    }

    /**
     * 
     * @param displayString
     * @param unitAmount
     * @param decimalPlaces
     * @param currency
     */
    public MinimumSubtotalMonetaryFields(String currency, String displayString, Object unitAmount, Integer decimalPlaces) {
        super();
        this.currency = currency;
        this.displayString = displayString;
        this.unitAmount = unitAmount;
        this.decimalPlaces = decimalPlaces;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public Object getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Object unitAmount) {
        this.unitAmount = unitAmount;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currency", currency).append("displayString", displayString).append("unitAmount", unitAmount).append("decimalPlaces", decimalPlaces).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(displayString).append(unitAmount).append(decimalPlaces).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MinimumSubtotalMonetaryFields) == false) {
            return false;
        }
        MinimumSubtotalMonetaryFields rhs = ((MinimumSubtotalMonetaryFields) other);
        return new EqualsBuilder().append(displayString, rhs.displayString).append(unitAmount, rhs.unitAmount).append(decimalPlaces, rhs.decimalPlaces).append(currency, rhs.currency).isEquals();
    }

}
