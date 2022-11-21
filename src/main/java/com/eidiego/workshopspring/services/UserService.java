package com.eidiego.workshopspring.services;

import com.eidiego.workshopspring.domain.User;
import com.eidiego.workshopspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    };

}
