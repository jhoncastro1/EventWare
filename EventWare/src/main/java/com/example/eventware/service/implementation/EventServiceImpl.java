package com.example.eventware.service.implementation;

import com.example.eventware.entities.Event;
import com.example.eventware.persistence.IEventDAO;
import com.example.eventware.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements IEventService {

    @Autowired
    private IEventDAO iEventDAO;

    @Override
    @Transactional(readOnly = true)
    public Event findById(long id) {
        return iEventDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Event> findAllEvents() {
        return (List<Event>) iEventDAO.findAll();
    }

    @Override
    @Transactional
    public void createEvent(Event event) {
        iEventDAO.save(event);
    }

    @Override
    @Transactional
    public void deleteEvent(Long id) {
        iEventDAO.deleteById(id);
    }
}
