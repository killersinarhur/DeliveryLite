
package com.ramon.deliverylite.webservice.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PopularItem {

    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("img_url")
    @Expose
    private String imgUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PopularItem() {
    }

    /**
     * 
     * @param id
     * @param imgUrl
     * @param price
     * @param description
     * @param name
     */
    public PopularItem(Integer price, String description, String imgUrl, Integer id, String name) {
        super();
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;
        this.id = id;
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("price", price).append("description", description).append("imgUrl", imgUrl).append("id", id).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(imgUrl).append(price).append(description).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PopularItem) == false) {
            return false;
        }
        PopularItem rhs = ((PopularItem) other);
        return new EqualsBuilder().append(id, rhs.id).append(imgUrl, rhs.imgUrl).append(price, rhs.price).append(description, rhs.description).append(name, rhs.name).isEquals();
    }

}
