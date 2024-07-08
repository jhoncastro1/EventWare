package com.example.eventware.service;

import com.example.eventware.entities.Event;
import com.example.eventware.entities.User;

import java.util.List;

public interface IEventService {

    Event findById(long id);

    List<Event> findAllEvents();

    void createEvent(Event event);

    void deleteEvent(Long id);

}
