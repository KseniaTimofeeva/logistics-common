package com.tsystems.app.logisticscommon;

import java.io.Serializable;

/**
 * Created by ksenia on 11.11.2017.
 */
public class GeneralInfoDto implements Serializable {

    private Long driverQty;
    private Long vacantDriverQty;
    private Long notAvailableDriverQty;

    private Long truckQty;
    private Long vacantTruckQty;
    private Long onOrderTruckQty;
    private Long notWorkingTruckQty;

    public Long getDriverQty() {
        return driverQty;
    }

    public void setDriverQty(Long driverQty) {
        this.driverQty = driverQty;
    }

    public Long getVacantDriverQty() {
        return vacantDriverQty;
    }

    public void setVacantDriverQty(Long vacantDriverQty) {
        this.vacantDriverQty = vacantDriverQty;
    }

    public Long getNotAvailableDriverQty() {
        return notAvailableDriverQty;
    }

    public void setNotAvailableDriverQty(Long notAvailableDriverQty) {
        this.notAvailableDriverQty = notAvailableDriverQty;
    }

    public Long getTruckQty() {
        return truckQty;
    }

    public void setTruckQty(Long truckQty) {
        this.truckQty = truckQty;
    }

    public Long getVacantTruckQty() {
        return vacantTruckQty;
    }

    public void setVacantTruckQty(Long vacantTruckQty) {
        this.vacantTruckQty = vacantTruckQty;
    }

    public Long getOnOrderTruckQty() {
        return onOrderTruckQty;
    }

    public void setOnOrderTruckQty(Long onOrderTruckQty) {
        this.onOrderTruckQty = onOrderTruckQty;
    }

    public Long getNotWorkingTruckQty() {
        return notWorkingTruckQty;
    }

    public void setNotWorkingTruckQty(Long notWorkingTruckQty) {
        this.notWorkingTruckQty = notWorkingTruckQty;
    }
}
