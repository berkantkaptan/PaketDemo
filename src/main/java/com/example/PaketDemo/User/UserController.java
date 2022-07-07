package com.example.PaketDemo.User;

import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/Users")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }
    @GetMapping("/Users/{id}")
    public User getOneUserbyId(@PathVariable int id){
        return userService.getUserByid(id);
    }
    @PostMapping("/Users/buyPackage/")
    public void buyPackage(int user_id, int package_id){
        userService.buyPackage(user_id,package_id);
    }
    @PostMapping("/Users/Sign_in")
    public void SignIn(String email,String password){
        userService.sign_in(email,password);
    }
    @PostMapping("/Users/Log_in")
    public String  LogIn(String email,String password){
       return userService.register(email, password);
    }

}
