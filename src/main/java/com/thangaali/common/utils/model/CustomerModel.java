package com.thangaali.common.utils.model;

public class CustomerModel {
    private Long customerId;
    private String fullName;
    private String city;
    private String emailAddress;
    private String phoneNumber;

    public CustomerModel() {
    }

    public CustomerModel(Long customerId, String fullName, String city, String emailAddress, String phoneNumber) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.city = city;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
