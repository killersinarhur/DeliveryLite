
package com.ramon.deliverylite.webservice.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MerchantPromotion {

    @SerializedName("minimum_subtotal_monetary_fields")
    @Expose
    private MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields;
    @SerializedName("delivery_fee")
    @Expose
    private Object deliveryFee;
    @SerializedName("delivery_fee_monetary_fields")
    @Expose
    private DeliveryFeeMonetaryFields deliveryFeeMonetaryFields;
    @SerializedName("minimum_subtotal")
    @Expose
    private Object minimumSubtotal;
    @SerializedName("new_store_customers_only")
    @Expose
    private Boolean newStoreCustomersOnly;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MerchantPromotion() {
    }

    /**
     * 
     * @param id
     * @param minimumSubtotalMonetaryFields
     * @param deliveryFeeMonetaryFields
     * @param newStoreCustomersOnly
     * @param minimumSubtotal
     * @param deliveryFee
     */
    public MerchantPromotion(MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields, Object deliveryFee, DeliveryFeeMonetaryFields deliveryFeeMonetaryFields, Object minimumSubtotal, Boolean newStoreCustomersOnly, Integer id) {
        super();
        this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
        this.deliveryFee = deliveryFee;
        this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
        this.minimumSubtotal = minimumSubtotal;
        this.newStoreCustomersOnly = newStoreCustomersOnly;
        this.id = id;
    }

    public MinimumSubtotalMonetaryFields getMinimumSubtotalMonetaryFields() {
        return minimumSubtotalMonetaryFields;
    }

    public void setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields) {
        this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
    }

    public Object getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Object deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public DeliveryFeeMonetaryFields getDeliveryFeeMonetaryFields() {
        return deliveryFeeMonetaryFields;
    }

    public void setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFields deliveryFeeMonetaryFields) {
        this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
    }

    public Object getMinimumSubtotal() {
        return minimumSubtotal;
    }

    public void setMinimumSubtotal(Object minimumSubtotal) {
        this.minimumSubtotal = minimumSubtotal;
    }

    public Boolean getNewStoreCustomersOnly() {
        return newStoreCustomersOnly;
    }

    public void setNewStoreCustomersOnly(Boolean newStoreCustomersOnly) {
        this.newStoreCustomersOnly = newStoreCustomersOnly;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minimumSubtotalMonetaryFields", minimumSubtotalMonetaryFields).append("deliveryFee", deliveryFee).append("deliveryFeeMonetaryFields", deliveryFeeMonetaryFields).append("minimumSubtotal", minimumSubtotal).append("newStoreCustomersOnly", newStoreCustomersOnly).append("id", id).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(minimumSubtotalMonetaryFields).append(deliveryFeeMonetaryFields).append(newStoreCustomersOnly).append(minimumSubtotal).append(deliveryFee).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MerchantPromotion) == false) {
            return false;
        }
        MerchantPromotion rhs = ((MerchantPromotion) other);
        return new EqualsBuilder().append(id, rhs.id).append(minimumSubtotalMonetaryFields, rhs.minimumSubtotalMonetaryFields).append(deliveryFeeMonetaryFields, rhs.deliveryFeeMonetaryFields).append(newStoreCustomersOnly, rhs.newStoreCustomersOnly).append(minimumSubtotal, rhs.minimumSubtotal).append(deliveryFee, rhs.deliveryFee).isEquals();
    }

}
