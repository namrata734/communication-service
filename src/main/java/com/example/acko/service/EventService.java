package com.example.acko.service;

import com.example.acko.entity.Event;
import com.example.acko.entity.SendMessage;
import com.example.acko.localDB.EventDB;
import com.example.acko.request.CreateEventRequest;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    public EventDB eventDB;
    public  SendMessage sendMessage;

    public String addEvent(CreateEventRequest createEventRequest) throws Exception {
        Event event = Event.builder()
                .id(createEventRequest.getId())
                .eventName(createEventRequest.getEventName())
                .eventDescription(createEventRequest.getEventDes())
                .build();
        eventDB.addEventInDB(event, createEventRequest.getEventName());
        // call /sendEmail

        return "event added";
    }


}
