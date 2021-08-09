package com.example.demo.user;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class UserService {
    public List<User> getUsers(){
        return Arrays.asList(
            new User(1L, "Nick", "Guitar", 0, "unranked")
        );
    }
}
