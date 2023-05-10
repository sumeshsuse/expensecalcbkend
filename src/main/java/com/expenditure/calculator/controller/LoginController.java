package com.expenditure.calculator.controller;

import com.expenditure.calculator.model.Login;
import com.expenditure.calculator.serviceImpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value = "/registerLoginUser", method = RequestMethod.POST)
    public ResponseEntity<Object> loginController(@RequestBody Login login){
        loginService.registerUser(login);
        return new ResponseEntity<>("Login is created successfully", HttpStatus.CREATED);
    }
}
