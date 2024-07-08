package com.example.eventware.service.implementation;

import com.example.eventware.entities.User;
import com.example.eventware.persistence.IUserDAO;
import com.example.eventware.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO iUserDAO;

    @Override
    @Transactional(readOnly = true)
    public User findById(long id) {
        return iUserDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAllUsers() {
        return (List<User>) iUserDAO.findAll();
    }

    @Override
    @Transactional
    public void createUser(User user) {
        iUserDAO.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        iUserDAO.deleteById(id);
    }
}
