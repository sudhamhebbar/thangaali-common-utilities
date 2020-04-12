package com.thangaali.common.utils.model;

public class CustomerModel {
    private Long id;
    private String fullName;
    private String city;
    private String email;
    private String phone;

    public CustomerModel() {
    }

    public CustomerModel(Long id, String fullName, String city, String email, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.city = city;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
