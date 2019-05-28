
package com.ramon.deliverylite.webservice.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Menu {

    @SerializedName("popular_items")
    @Expose
    private List<PopularItem> popularItems = null;
    @SerializedName("is_catering")
    @Expose
    private Boolean isCatering;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
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
    public Menu() {
    }

    /**
     * 
     * @param id
     * @param popularItems
     * @param name
     * @param subtitle
     * @param isCatering
     */
    public Menu(List<PopularItem> popularItems, Boolean isCatering, String subtitle, Integer id, String name) {
        super();
        this.popularItems = popularItems;
        this.isCatering = isCatering;
        this.subtitle = subtitle;
        this.id = id;
        this.name = name;
    }

    public List<PopularItem> getPopularItems() {
        return popularItems;
    }

    public void setPopularItems(List<PopularItem> popularItems) {
        this.popularItems = popularItems;
    }

    public Boolean getIsCatering() {
        return isCatering;
    }

    public void setIsCatering(Boolean isCatering) {
        this.isCatering = isCatering;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
        return new ToStringBuilder(this).append("popularItems", popularItems).append("isCatering", isCatering).append("subtitle", subtitle).append("id", id).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(popularItems).append(name).append(subtitle).append(isCatering).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Menu) == false) {
            return false;
        }
        Menu rhs = ((Menu) other);
        return new EqualsBuilder().append(id, rhs.id).append(popularItems, rhs.popularItems).append(name, rhs.name).append(subtitle, rhs.subtitle).append(isCatering, rhs.isCatering).isEquals();
    }

}
