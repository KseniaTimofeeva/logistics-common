package com.tsystems.app.logisticscommon;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ksenia on 13.11.2017.
 */
public class CrewDriverInfoDto implements Serializable {
    private Long id;
    private List<DriverShortDto> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DriverShortDto> getUsers() {
        return users;
    }

    public void setUsers(List<DriverShortDto> users) {
        this.users = users;
    }
}
