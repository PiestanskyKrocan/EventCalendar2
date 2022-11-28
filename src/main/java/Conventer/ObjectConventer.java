package Conventer;

import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.protobuf.Event;

import java.util.Date;

public class ObjectConventer {

    private EventEntity eventEntity;
    private Event protoEvent;
    private long id;
    private String name;
    private String bodytext;
    private Long startTime;
    private Long endTime;
    private String address;
    public void ConvertEventEntityToProtoEvent(Event protoEvent){
        id = (long)protoEvent.getEventId();
        name= protoEvent.getName();
        bodytext = protoEvent.getBodytext();
        startTime = Long.valueOf(protoEvent.getStartTime());
        endTime = Long.valueOf(protoEvent.getEndTime());
        address = protoEvent.getAddress();
    }


    };



}
