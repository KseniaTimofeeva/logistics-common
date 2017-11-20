package com.tsystems.app.logisticscommon;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ksenia on 20.11.2017.
 */
public class CrewShortDto implements Serializable {

    private Long id;
    private String truckNumberPlate;
    private List<DriverShortDto> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTruckNumberPlate() {
        return truckNumberPlate;
    }

    public void setTruckNumberPlate(String truckNumberPlate) {
        this.truckNumberPlate = truckNumberPlate;
    }

    public List<DriverShortDto> getUsers() {
        return users;
    }

    public void setUsers(List<DriverShortDto> users) {
        this.users = users;
    }
}
