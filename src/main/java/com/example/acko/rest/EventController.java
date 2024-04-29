package com.example.acko.rest;

import com.example.acko.request.CreateEventRequest;
import com.example.acko.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    public EventService eventService;

    @PostMapping("/createEvent")
    public ResponseEntity<String> createAnEvent(@RequestBody CreateEventRequest createEventRequest) throws Exception {
        return ResponseEntity.ok(eventService.addEvent(createEventRequest));
    }


}
