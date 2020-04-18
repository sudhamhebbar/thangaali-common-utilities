package com.thangaali.common.utils.model;

import java.util.Date;

public class BookingModel {
    private Long bookingId;
    private Long customerId;
    private Date bookingDate;
    private Long numberOfPeople;
    private Date checkInDate;
    private Date checkOutDate;
    private String bookedBy;
    private Long numberOfDays;

    public BookingModel() {
    }

    public BookingModel(Long bookingId, Long customerId, Date bookingDate, Long numberOfPeople, Date checkInDate, Date checkOutDate, String bookedBy, Long numberOfDays) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.bookingDate = bookingDate;
        this.numberOfPeople = numberOfPeople;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookedBy = bookedBy;
        this.numberOfDays = numberOfDays;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public Long getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Long numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
