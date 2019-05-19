package com.buyandsell.buyandsell.service;

import com.buyandsell.buyandsell.Repository.UserRepository;
import com.buyandsell.buyandsell.common.Session;
import com.buyandsell.buyandsell.common.Validator;
import com.buyandsell.buyandsell.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {

        if (Validator.isValidUser(user)) {
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    public User updateUser(User user) {

        if ((Session.getCurrentUser().equals(user) && Validator.isValidUser(user)))
            return userRepository.save(user);
        else
            return null;
    }

    @Override
    public void deleteUser(Long userID) {

        if (Session.getCurrentUser().getId().equals(userID)) {
            userRepository.delete(Session.getCurrentUser());
        }
    }

    @Override
    public User getUser(String email) {

        return userRepository.findByEmail(email);
    }

    @Override
    public User authUserByEmail(String email, String pw) {

        return userRepository.findByEmailAndPw(email, pw);
    }

    @Override
    public User authUserByUname(String uname, String pw) {

        return userRepository.findByUnameAndPw(uname, pw);
    }
}
