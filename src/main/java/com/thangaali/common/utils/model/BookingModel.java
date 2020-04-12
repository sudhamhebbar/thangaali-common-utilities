package com.thangaali.common.utils.model;



import java.util.Date;
import java.util.HashMap;

public class BookingModel {
    private Long bookingId;
    private Long customerId;
    private Long numberOfPeople;
    private Date bookingDate;
    private Date fromDate;
    private Date toDate;
    private Long numberOfDays;
    private String bookedBy;

    public BookingModel() {
    }

    public BookingModel(Long bookingId, Long customerId, Long numberOfPeople, Date bookingDate, Date fromDate, Date toDate, Long numberOfDays, String bookedBy) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.numberOfPeople = numberOfPeople;
        this.bookingDate = bookingDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.numberOfDays = numberOfDays;
        this.bookedBy = bookedBy;
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

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Long getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Long numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }
}
