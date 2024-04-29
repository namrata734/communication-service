package com.example.acko.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Event {
    private String id;
    private String eventName;
    private String eventDescription;
}
