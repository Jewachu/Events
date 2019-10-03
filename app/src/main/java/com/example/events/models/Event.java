
package com.example.events.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Event {

    @SerializedName("name")
    @Expose
     Name name;
    @SerializedName("description")
    @Expose
     Description description;
    @SerializedName("id")
    @Expose
    String id;
    @SerializedName("url")
    @Expose
     String url;
    @SerializedName("vanity_url")
    @Expose
    String vanityUrl;
    @SerializedName("start")
    @Expose
     Start start;
    @SerializedName("end")
    @Expose
     End end;
    @SerializedName("organization_id")
    @Expose
     String organizationId;
    @SerializedName("created")
    @Expose
    String created;
    @SerializedName("changed")
    @Expose
     String changed;
    @SerializedName("published")
    @Expose
     String published;
    @SerializedName("capacity")
    @Expose
     transient Object capacity;
    @SerializedName("capacity_is_custom")
    @Expose
     transient Object capacityIsCustom;
    @SerializedName("status")
    @Expose
    String status;
    @SerializedName("currency")
    @Expose
     String currency;
    @SerializedName("listed")
    @Expose
     Boolean listed;
    @SerializedName("shareable")
    @Expose
    Boolean shareable;
    @SerializedName("online_event")
    @Expose
    Boolean onlineEvent;
    @SerializedName("tx_time_limit")
    @Expose
     Integer txTimeLimit;
    @SerializedName("hide_start_date")
    @Expose
     Boolean hideStartDate;
    @SerializedName("hide_end_date")
    @Expose
    Boolean hideEndDate;
    @SerializedName("locale")
    @Expose
    String locale;
    @SerializedName("is_locked")
    @Expose
     Boolean isLocked;
    @SerializedName("privacy_setting")
    @Expose
    String privacySetting;
    @SerializedName("is_series")
    @Expose
     Boolean isSeries;
    @SerializedName("is_series_parent")
    @Expose
     Boolean isSeriesParent;
    @SerializedName("inventory_type")
    @Expose
     String inventoryType;
    @SerializedName("is_reserved_seating")
    @Expose
     Boolean isReservedSeating;
    @SerializedName("show_pick_a_seat")
    @Expose
    Boolean showPickASeat;
    @SerializedName("show_seatmap_thumbnail")
    @Expose
     Boolean showSeatmapThumbnail;
    @SerializedName("show_colors_in_seatmap_thumbnail")
    @Expose
    Boolean showColorsInSeatmapThumbnail;
    @SerializedName("source")
    @Expose
    String source;
    @SerializedName("is_free")
    @Expose
    Boolean isFree;
    @SerializedName("version")
    @Expose
     String version;
    @SerializedName("summary")
    @Expose
     String summary;
    @SerializedName("logo_id")
    @Expose
     String logoId;
    @SerializedName("organizer_id")
    @Expose
     String organizerId;
    @SerializedName("venue_id")
    @Expose
    String venueId;
    @SerializedName("category_id")
    @Expose
     transient Object categoryId;
    @SerializedName("subcategory_id")
    @Expose
   transient Object subcategoryId;
    @SerializedName("format_id")
    @Expose
    transient Object formatId;
    @SerializedName("resource_uri")
    @Expose
     String resourceUri;
    @SerializedName("is_externally_ticketed")
    @Expose
     Boolean isExternallyTicketed;
    @SerializedName("logo")
    @Expose
    Logo logo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param subcategoryId
     * @param summary
     * @param locale
     * @param organizationId
     * @param organizerId
     * @param logoId
     * @param version
     * @param changed
     * @param currency
     * @param id
     * @param capacityIsCustom
     * @param isSeriesParent
     * @param created
     * @param inventoryType
     * @param description
     * @param hideEndDate
     * @param name
     * @param capacity
     * @param onlineEvent
     * @param published
     * @param venueId
     * @param txTimeLimit
     * @param end
     * @param showSeatmapThumbnail
     * @param listed
     * @param logo
     * @param showPickASeat
     * @param shareable
     * @param status
     * @param categoryId
     * @param privacySetting
     * @param showColorsInSeatmapThumbnail
     * @param url
     * @param hideStartDate
     * @param isSeries
     * @param isLocked
     * @param formatId
     * @param source
     * @param isFree
     * @param start
     * @param isExternallyTicketed
     * @param vanityUrl
     * @param resourceUri
     * @param isReservedSeating
     */
    public Event(Name name, Description description, String id, String url, String vanityUrl, Start start, End end, String organizationId, String created, String changed, String published, Object capacity, Object capacityIsCustom, String status, String currency, Boolean listed, Boolean shareable, Boolean onlineEvent, Integer txTimeLimit, Boolean hideStartDate, Boolean hideEndDate, String locale, Boolean isLocked, String privacySetting, Boolean isSeries, Boolean isSeriesParent, String inventoryType, Boolean isReservedSeating, Boolean showPickASeat, Boolean showSeatmapThumbnail, Boolean showColorsInSeatmapThumbnail, String source, Boolean isFree, String version, String summary, String logoId, String organizerId, String venueId, Object categoryId, Object subcategoryId, Object formatId, String resourceUri, Boolean isExternallyTicketed, Logo logo) {
        super();
        this.name = name;
        this.description = description;
        this.id = id;
        this.url = url;
        this.vanityUrl = vanityUrl;
        this.start = start;
        this.end = end;
        this.organizationId = organizationId;
        this.created = created;
        this.changed = changed;
        this.published = published;
        this.capacity = capacity;
        this.capacityIsCustom = capacityIsCustom;
        this.status = status;
        this.currency = currency;
        this.listed = listed;
        this.shareable = shareable;
        this.onlineEvent = onlineEvent;
        this.txTimeLimit = txTimeLimit;
        this.hideStartDate = hideStartDate;
        this.hideEndDate = hideEndDate;
        this.locale = locale;
        this.isLocked = isLocked;
        this.privacySetting = privacySetting;
        this.isSeries = isSeries;
        this.isSeriesParent = isSeriesParent;
        this.inventoryType = inventoryType;
        this.isReservedSeating = isReservedSeating;
        this.showPickASeat = showPickASeat;
        this.showSeatmapThumbnail = showSeatmapThumbnail;
        this.showColorsInSeatmapThumbnail = showColorsInSeatmapThumbnail;
        this.source = source;
        this.isFree = isFree;
        this.version = version;
        this.summary = summary;
        this.logoId = logoId;
        this.organizerId = organizerId;
        this.venueId = venueId;
        this.categoryId = categoryId;
        this.subcategoryId = subcategoryId;
        this.formatId = formatId;
        this.resourceUri = resourceUri;
        this.isExternallyTicketed = isExternallyTicketed;
        this.logo = logo;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVanityUrl() {
        return vanityUrl;
    }

    public void setVanityUrl(String vanityUrl) {
        this.vanityUrl = vanityUrl;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Object getCapacity() {
        return capacity;
    }

    public void setCapacity(Object capacity) {
        this.capacity = capacity;
    }

    public Object getCapacityIsCustom() {
        return capacityIsCustom;
    }

    public void setCapacityIsCustom(Object capacityIsCustom) {
        this.capacityIsCustom = capacityIsCustom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getListed() {
        return listed;
    }

    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public Boolean getOnlineEvent() {
        return onlineEvent;
    }

    public void setOnlineEvent(Boolean onlineEvent) {
        this.onlineEvent = onlineEvent;
    }

    public Integer getTxTimeLimit() {
        return txTimeLimit;
    }

    public void setTxTimeLimit(Integer txTimeLimit) {
        this.txTimeLimit = txTimeLimit;
    }

    public Boolean getHideStartDate() {
        return hideStartDate;
    }

    public void setHideStartDate(Boolean hideStartDate) {
        this.hideStartDate = hideStartDate;
    }

    public Boolean getHideEndDate() {
        return hideEndDate;
    }

    public void setHideEndDate(Boolean hideEndDate) {
        this.hideEndDate = hideEndDate;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    public Boolean getIsSeries() {
        return isSeries;
    }

    public void setIsSeries(Boolean isSeries) {
        this.isSeries = isSeries;
    }

    public Boolean getIsSeriesParent() {
        return isSeriesParent;
    }

    public void setIsSeriesParent(Boolean isSeriesParent) {
        this.isSeriesParent = isSeriesParent;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Boolean getIsReservedSeating() {
        return isReservedSeating;
    }

    public void setIsReservedSeating(Boolean isReservedSeating) {
        this.isReservedSeating = isReservedSeating;
    }

    public Boolean getShowPickASeat() {
        return showPickASeat;
    }

    public void setShowPickASeat(Boolean showPickASeat) {
        this.showPickASeat = showPickASeat;
    }

    public Boolean getShowSeatmapThumbnail() {
        return showSeatmapThumbnail;
    }

    public void setShowSeatmapThumbnail(Boolean showSeatmapThumbnail) {
        this.showSeatmapThumbnail = showSeatmapThumbnail;
    }

    public Boolean getShowColorsInSeatmapThumbnail() {
        return showColorsInSeatmapThumbnail;
    }

    public void setShowColorsInSeatmapThumbnail(Boolean showColorsInSeatmapThumbnail) {
        this.showColorsInSeatmapThumbnail = showColorsInSeatmapThumbnail;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Object getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Object subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Object getFormatId() {
        return formatId;
    }

    public void setFormatId(Object formatId) {
        this.formatId = formatId;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public Boolean getIsExternallyTicketed() {
        return isExternallyTicketed;
    }

    public void setIsExternallyTicketed(Boolean isExternallyTicketed) {
        this.isExternallyTicketed = isExternallyTicketed;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }


}
