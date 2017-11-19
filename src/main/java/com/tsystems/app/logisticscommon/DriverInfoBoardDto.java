package com.tsystems.app.logisticscommon;

import java.io.Serializable;

/**
 * Created by ksenia on 14.11.2017.
 */
public class DriverInfoBoardDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String personalNumber;
    private Boolean onOrder;
    private CityDto currentCity;
    private Double alreadyWorkedHrs;
    private Double remainHrs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Boolean getOnOrder() {
        return onOrder;
    }

    public void setOnOrder(Boolean onOrder) {
        this.onOrder = onOrder;
    }

    public CityDto getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(CityDto currentCity) {
        this.currentCity = currentCity;
    }

    public Double getAlreadyWorkedHrs() {
        return alreadyWorkedHrs;
    }

    public void setAlreadyWorkedHrs(Double alreadyWorkedHrs) {
        this.alreadyWorkedHrs = alreadyWorkedHrs;
    }

    public Double getRemainHrs() {
        return remainHrs;
    }

    public void setRemainHrs(Double remainHrs) {
        this.remainHrs = remainHrs;
    }
}
