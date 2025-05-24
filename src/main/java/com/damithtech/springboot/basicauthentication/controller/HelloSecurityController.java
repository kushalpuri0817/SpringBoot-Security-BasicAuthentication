package com.damithtech.springboot.basicauthentication.controller;

import com.damithtech.springboot.basicauthentication.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DAMITH SAMARAKOON on 3/24/2020
 */
@RestController
public class HelloSecurityController {
    @RequestMapping("/users")
    public User getAllUsers() {
        return new User("user1", "0001");
    }
}
