
package com.ramon.deliverylite.webservice.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Restaurant {

    @SerializedName("is_time_surging")
    @Expose
    private Boolean isTimeSurging;
    @SerializedName("max_order_size")
    @Expose
    private Double maxOrderSize;
    @SerializedName("delivery_fee")
    @Expose
    private Double deliveryFee;
    @SerializedName("max_composite_score")
    @Expose
    private Double maxCompositeScore;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("merchant_promotions")
    @Expose
    private List<MerchantPromotion> merchantPromotions = null;
    @SerializedName("average_rating")
    @Expose
    private Double averageRating;
    @SerializedName("menus")
    @Expose
    private List<Menu> menus = null;
    @SerializedName("composite_score")
    @Expose
    private Integer compositeScore;
    @SerializedName("status_type")
    @Expose
    private String statusType;
    @SerializedName("is_only_catering")
    @Expose
    private Boolean isOnlyCatering;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("number_of_ratings")
    @Expose
    private Integer numberOfRatings;
    @SerializedName("asap_time")
    @Expose
    private Object asapTime;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("business")
    @Expose
    private Business business;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("yelp_review_count")
    @Expose
    private Integer yelpReviewCount;
    @SerializedName("business_id")
    @Expose
    private Integer businessId;
    @SerializedName("extra_sos_delivery_fee")
    @Expose
    private Integer extraSosDeliveryFee;
    @SerializedName("yelp_rating")
    @Expose
    private Double yelpRating;
    @SerializedName("cover_img_url")
    @Expose
    private String coverImgUrl;
    @SerializedName("header_img_url")
    @Expose
    private String headerImgUrl;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_newly_added")
    @Expose
    private Boolean isNewlyAdded;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("service_rate")
    @Expose
    private Double serviceRate;
    @SerializedName("promotion")
    @Expose
    private Object promotion;
    @SerializedName("featured_category_description")
    @Expose
    private Object featuredCategoryDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Restaurant() {
    }

    /**
     * @param isTimeSurging
     * @param maxOrderSize
     * @param deliveryFee
     * @param maxCompositeScore
     * @param id
     * @param merchantPromotions
     * @param averageRating
     * @param menus
     * @param compositeScore
     * @param statusType
     * @param isOnlyCatering
     * @param status
     * @param numberOfRatings
     * @param asapTime
     * @param description
     * @param business
     * @param tags
     * @param yelpReviewCount
     * @param businessId
     * @param extraSosDeliveryFee
     * @param yelpRating
     * @param coverImgUrl
     * @param headerImgUrl
     * @param address
     * @param priceRange
     * @param slug
     * @param name
     * @param isNewlyAdded
     * @param url
     * @param serviceRate
     * @param promotion
     * @param featuredCategoryDescription
     */
    public Restaurant(Boolean isTimeSurging, Double maxOrderSize, Double deliveryFee, Double maxCompositeScore, Integer id, List<MerchantPromotion> merchantPromotions, Double averageRating, List<Menu> menus, Integer compositeScore, String statusType, Boolean isOnlyCatering, String status, Integer numberOfRatings, Object asapTime, String description, Business business, List<String> tags, Integer yelpReviewCount, Integer businessId, Integer extraSosDeliveryFee, Double yelpRating, String coverImgUrl, String headerImgUrl, Address address, Integer priceRange, String slug, String name, Boolean isNewlyAdded, String url, Double serviceRate, Object promotion, Object featuredCategoryDescription) {
        super();
        this.isTimeSurging = isTimeSurging;
        this.maxOrderSize = maxOrderSize;
        this.deliveryFee = deliveryFee;
        this.maxCompositeScore = maxCompositeScore;
        this.id = id;
        this.merchantPromotions = merchantPromotions;
        this.averageRating = averageRating;
        this.menus = menus;
        this.compositeScore = compositeScore;
        this.statusType = statusType;
        this.isOnlyCatering = isOnlyCatering;
        this.status = status;
        this.numberOfRatings = numberOfRatings;
        this.asapTime = asapTime;
        this.description = description;
        this.business = business;
        this.tags = tags;
        this.yelpReviewCount = yelpReviewCount;
        this.businessId = businessId;
        this.extraSosDeliveryFee = extraSosDeliveryFee;
        this.yelpRating = yelpRating;
        this.coverImgUrl = coverImgUrl;
        this.headerImgUrl = headerImgUrl;
        this.address = address;
        this.priceRange = priceRange;
        this.slug = slug;
        this.name = name;
        this.isNewlyAdded = isNewlyAdded;
        this.url = url;
        this.serviceRate = serviceRate;
        this.promotion = promotion;
        this.featuredCategoryDescription = featuredCategoryDescription;
    }

    public Boolean getIsTimeSurging() {
        return isTimeSurging;
    }

    public void setIsTimeSurging(Boolean isTimeSurging) {
        this.isTimeSurging = isTimeSurging;
    }

    public Object getMaxOrderSize() {
        return maxOrderSize;
    }

    public void setMaxOrderSize(Double maxOrderSize) {
        this.maxOrderSize = maxOrderSize;
    }

    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Double getMaxCompositeScore() {
        return maxCompositeScore;
    }

    public void setMaxCompositeScore(Double maxCompositeScore) {
        this.maxCompositeScore = maxCompositeScore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MerchantPromotion> getMerchantPromotions() {
        return merchantPromotions;
    }

    public void setMerchantPromotions(List<MerchantPromotion> merchantPromotions) {
        this.merchantPromotions = merchantPromotions;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Integer getCompositeScore() {
        return compositeScore;
    }

    public void setCompositeScore(Integer compositeScore) {
        this.compositeScore = compositeScore;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public Boolean getIsOnlyCatering() {
        return isOnlyCatering;
    }

    public void setIsOnlyCatering(Boolean isOnlyCatering) {
        this.isOnlyCatering = isOnlyCatering;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public Object getAsapTime() {
        return asapTime;
    }

    public void setAsapTime(Object asapTime) {
        this.asapTime = asapTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getYelpReviewCount() {
        return yelpReviewCount;
    }

    public void setYelpReviewCount(Integer yelpReviewCount) {
        this.yelpReviewCount = yelpReviewCount;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getExtraSosDeliveryFee() {
        return extraSosDeliveryFee;
    }

    public void setExtraSosDeliveryFee(Integer extraSosDeliveryFee) {
        this.extraSosDeliveryFee = extraSosDeliveryFee;
    }

    public Double getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(Double yelpRating) {
        this.yelpRating = yelpRating;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsNewlyAdded() {
        return isNewlyAdded;
    }

    public void setIsNewlyAdded(Boolean isNewlyAdded) {
        this.isNewlyAdded = isNewlyAdded;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(Double serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    public Object getFeaturedCategoryDescription() {
        return featuredCategoryDescription;
    }

    public void setFeaturedCategoryDescription(Object featuredCategoryDescription) {
        this.featuredCategoryDescription = featuredCategoryDescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isTimeSurging", isTimeSurging).append("maxOrderSize", maxOrderSize).append("deliveryFee", deliveryFee).append("maxCompositeScore", maxCompositeScore).append("id", id).append("merchantPromotions", merchantPromotions).append("averageRating", averageRating).append("menus", menus).append("compositeScore", compositeScore).append("statusType", statusType).append("isOnlyCatering", isOnlyCatering).append("status", status).append("numberOfRatings", numberOfRatings).append("asapTime", asapTime).append("description", description).append("business", business).append("tags", tags).append("yelpReviewCount", yelpReviewCount).append("businessId", businessId).append("extraSosDeliveryFee", extraSosDeliveryFee).append("yelpRating", yelpRating).append("coverImgUrl", coverImgUrl).append("headerImgUrl", headerImgUrl).append("address", address).append("priceRange", priceRange).append("slug", slug).append("name", name).append("isNewlyAdded", isNewlyAdded).append("url", url).append("serviceRate", serviceRate).append("promotion", promotion).append("featuredCategoryDescription", featuredCategoryDescription).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(menus).append(isTimeSurging).append(averageRating).append(statusType).append(promotion).append(asapTime).append(business).append(id).append(coverImgUrl).append(headerImgUrl).append(description).append(compositeScore).append(name).append(featuredCategoryDescription).append(businessId).append(deliveryFee).append(tags).append(extraSosDeliveryFee).append(status).append(serviceRate).append(isOnlyCatering).append(url).append(isNewlyAdded).append(priceRange).append(address).append(maxCompositeScore).append(merchantPromotions).append(yelpReviewCount).append(slug).append(maxOrderSize).append(numberOfRatings).append(yelpRating).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restaurant) == false) {
            return false;
        }
        Restaurant rhs = ((Restaurant) other);
        return new EqualsBuilder().append(menus, rhs.menus).append(isTimeSurging, rhs.isTimeSurging).append(averageRating, rhs.averageRating).append(statusType, rhs.statusType).append(promotion, rhs.promotion).append(asapTime, rhs.asapTime).append(business, rhs.business).append(id, rhs.id).append(coverImgUrl, rhs.coverImgUrl).append(headerImgUrl, rhs.headerImgUrl).append(description, rhs.description).append(compositeScore, rhs.compositeScore).append(name, rhs.name).append(featuredCategoryDescription, rhs.featuredCategoryDescription).append(businessId, rhs.businessId).append(deliveryFee, rhs.deliveryFee).append(tags, rhs.tags).append(extraSosDeliveryFee, rhs.extraSosDeliveryFee).append(status, rhs.status).append(serviceRate, rhs.serviceRate).append(isOnlyCatering, rhs.isOnlyCatering).append(url, rhs.url).append(isNewlyAdded, rhs.isNewlyAdded).append(priceRange, rhs.priceRange).append(address, rhs.address).append(maxCompositeScore, rhs.maxCompositeScore).append(merchantPromotions, rhs.merchantPromotions).append(yelpReviewCount, rhs.yelpReviewCount).append(slug, rhs.slug).append(maxOrderSize, rhs.maxOrderSize).append(numberOfRatings, rhs.numberOfRatings).append(yelpRating, rhs.yelpRating).isEquals();
    }

}
