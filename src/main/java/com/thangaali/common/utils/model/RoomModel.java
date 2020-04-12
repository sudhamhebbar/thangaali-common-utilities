package com.thangaali.common.utils.model;

public class RoomModel {
    private Long id;
    private String type;
    private String name;
    private Long numberOfPeople;
    private Long weekendPrice;
    private Long weekdayPrice;

    public RoomModel() {
    }

    public RoomModel(Long id, String type, String name, Long numberOfPeople, Long weekendPrice, Long weekdayPrice) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.weekendPrice = weekendPrice;
        this.weekdayPrice = weekdayPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Long getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(Long weekendPrice) {
        this.weekendPrice = weekendPrice;
    }

    public Long getWeekdayPrice() {
        return weekdayPrice;
    }

    public void setWeekdayPrice(Long weekdayPrice) {
        this.weekdayPrice = weekdayPrice;
    }
}
