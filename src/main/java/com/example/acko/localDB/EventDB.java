package com.example.acko.localDB;

import com.example.acko.entity.Event;

import java.util.HashMap;
import java.util.Map;

public class EventDB {
    Map<String, Event> eventMap = new HashMap<>();

    public void addEventInDB(Event event, String name) throws Exception {
        if(eventMap.containsKey(name)){
            throw new Exception("Event Name is already present in DB");
        }
        eventMap.put(name, event);
    }
}
