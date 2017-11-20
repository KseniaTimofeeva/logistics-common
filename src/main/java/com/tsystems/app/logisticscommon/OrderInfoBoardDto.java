package com.tsystems.app.logisticscommon;

import com.tsystems.app.logisticscommon.enums.OrderStatus;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ksenia on 20.11.2017.
 */
public class OrderInfoBoardDto implements Serializable {

    private Long id;
    private String number;
    private OrderStatus status;
    private CityDto start;
    private CityDto finish;
    private CrewShortDto crew;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public CityDto getStart() {
        return start;
    }

    public void setStart(CityDto start) {
        this.start = start;
    }

    public CityDto getFinish() {
        return finish;
    }

    public void setFinish(CityDto finish) {
        this.finish = finish;
    }

    public CrewShortDto getCrew() {
        return crew;
    }

    public void setCrew(CrewShortDto crew) {
        this.crew = crew;
    }
}
