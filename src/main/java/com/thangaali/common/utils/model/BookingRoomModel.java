package com.thangaali.common.utils.model;

public class BookingRoomModel {
    public Long bookingRoomId;
    public Long bookingId ;
    public Long roomId;
    public Boolean extraBed;
    public Long numberOfPeople;

    public BookingRoomModel() {
    }

    public BookingRoomModel(Long bookingRoomId, Long bookingId, Long roomId, Boolean extraBed, Long numberOfPeople) {
        this.bookingRoomId = bookingRoomId;
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.extraBed = extraBed;
        this.numberOfPeople = numberOfPeople;
    }

    public Long getBookingRoomId() {
        return bookingRoomId;
    }

    public void setBookingRoomId(Long bookingRoomId) {
        this.bookingRoomId = bookingRoomId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Boolean getExtraBed() {
        return extraBed;
    }

    public void setExtraBed(Boolean extraBed) {
        this.extraBed = extraBed;
    }

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
