package com.tsystems.app.logisticscommon;

import java.io.Serializable;

/**
 * Created by ksenia on 12.11.2017.
 */
public class TruckFullDto implements Serializable {

    private Long id;
    private String numberPlate;
    private Float workingShift;
    private Float capacity;
    private Boolean functioning;
    private Boolean onOrder;
    private CrewDriverInfoDto crew;
    private CityDto currentCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Float getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(Float workingShift) {
        this.workingShift = workingShift;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Boolean getFunctioning() {
        return functioning;
    }

    public void setFunctioning(Boolean functioning) {
        this.functioning = functioning;
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

    public CrewDriverInfoDto getCrew() {
        return crew;
    }

    public void setCrew(CrewDriverInfoDto crew) {
        this.crew = crew;
    }
}

