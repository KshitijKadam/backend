package com.nexahomes.loginproject.controller;

import com.nexahomes.loginproject.model.User;
import com.nexahomes.loginproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class Home {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/login")
    public Boolean welcome(@RequestParam(value = "username") String userName, @RequestParam(value = "password") String password){
        List<User> user = userRepo.userIsTrue(password,userName);
        System.out.println(user);
        if(user.isEmpty()){
            return false;
        }
        return true;
    }

}
