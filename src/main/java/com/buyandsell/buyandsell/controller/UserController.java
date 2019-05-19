package com.buyandsell.buyandsell.controller;

import com.buyandsell.buyandsell.model.User;
import com.buyandsell.buyandsell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User addUser(User user) {

        return userService.addUser(user);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public User updateUser(User user) {

        return userService.updateUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUser(Long userId) {

        userService.deleteUser(userId);
    }

    @RequestMapping(value = "/authUser", method = RequestMethod.POST)
    public User authUser(String email, String pw) {

        return userService.authUserByEmail(email, pw);
    }

    @RequestMapping(value = "/getUserByEmail")
    public User getUserByEmail(String email) {

        return userService.getUser(email);
    }
}
