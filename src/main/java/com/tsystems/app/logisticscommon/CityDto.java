package com.tsystems.app.logisticscommon;

import java.io.Serializable;

/**
 * Created by ksenia on 14.10.2017.
 */
public class CityDto implements Serializable{
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
