package de.cofinpro.hackaton.registration.api;

import javax.ws.rs.FormParam;

public class PersonalData {

    @FormParam("name")
    private String name;
    @FormParam("address1")
    private String address1;
    @FormParam("address2")
    private String address2;
    @FormParam("zip")
    private String zip;
    @FormParam("city")
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

