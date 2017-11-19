package com.tsystems.app.logisticscommon;

import java.io.Serializable;

/**
 * Created by ksenia on 14.11.2017.
 */
public class MessageDto implements Serializable {

    private MessageType messageType;
    private Object change;

    public MessageDto() {
    }

    public MessageDto(MessageType messageType, Object change) {
        this.messageType = messageType;
        this.change = change;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Object getChange() {
        return change;
    }

    public void setChange(Object change) {
        this.change = change;
    }
}
