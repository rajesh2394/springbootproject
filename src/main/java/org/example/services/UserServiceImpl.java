package org.example.services;

import org.example.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repositories.UserRepository;

@Service
public  class UserServiceImpl implements Userservices
{
    @Autowired
    private UserRepository UserRepository;


    @Override
    public User createUser(User user)
    {
        return UserRepository.save(user);

    }

}
