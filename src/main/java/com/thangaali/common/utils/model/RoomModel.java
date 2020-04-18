package com.thangaali.common.utils.model;

public class RoomModel {
    private Long roomId;
    private String roomName;
    private Long numberOfPeople;
    private Long price;
    private Long extraBedPrice;

    public RoomModel() {
    }

    public RoomModel(Long roomId, String roomName, Long numberOfPeople, Long price, Long extraBedPrice) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.numberOfPeople = numberOfPeople;
        this.price = price;
        this.extraBedPrice = extraBedPrice;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getExtraBedPrice() {
        return extraBedPrice;
    }

    public void setExtraBedPrice(Long extraBedPrice) {
        this.extraBedPrice = extraBedPrice;
    }
}
