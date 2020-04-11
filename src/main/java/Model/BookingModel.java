package Model;



import java.util.Date;

public class BookingModel {
    private Long bookingId;
    private Long customerId;
    private Long roomId;
    private Long numberOfPeople;
    private Boolean extraBed;
    private Date bookingDate;
    private Date fromDate;
    private Date toDate;
    private Long numberOfDays;
    private String bookedBy;

    public BookingModel() {
    }

    public BookingModel(Long bookingId, Long customerId, Long roomId, Long numberOfPeople, Boolean extraBed, Date bookingDate, Date fromDate, Date toDate, Long numberOfDays, String bookedBy) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.roomId = roomId;
        this.numberOfPeople = numberOfPeople;
        this.extraBed = extraBed;
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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Boolean getExtraBed() {
        return extraBed;
    }

    public void setExtraBed(Boolean extraBed) {
        this.extraBed = extraBed;
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
