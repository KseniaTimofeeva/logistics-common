package com.tsystems.app.logisticscommon;

/**
 * Created by ksenia on 14.11.2017.
 */
public enum MessageType {
    GENERAL("GENERAL"),
    ADD_DRIVER("ADD_DRIVER"),
    UPDATE_DRIVER("UPDATE_DRIVER"),
    DELETE_DRIVER("DELETE_DRIVER"),
    ADD_TRUCK("ADD_TRUCK"),
    UPDATE_TRUCK("UPDATE_TRUCK"),
    DELETE_TRUCK("DELETE_TRUCK"),
    ADD_ORDER("ADD_ORDER"),
    UPDATE_ORDER("UPDATE_ORDER"),
    DELETE_ORDER("DELETE_ORDER");

    private final String name;

    MessageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
