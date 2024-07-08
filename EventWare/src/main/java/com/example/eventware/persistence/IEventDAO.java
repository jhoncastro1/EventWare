package com.example.eventware.persistence;

import com.example.eventware.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface IEventDAO extends CrudRepository<Event , Long> {
}
