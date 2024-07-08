package com.example.eventware.persistence;

import com.example.eventware.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDAO extends CrudRepository<User, Long> {
}
