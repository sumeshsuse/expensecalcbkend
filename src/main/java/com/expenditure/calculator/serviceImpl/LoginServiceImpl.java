package com.expenditure.calculator.serviceImpl;

import com.expenditure.calculator.model.Login;
import com.expenditure.calculator.repository.LoginRepository;
import com.expenditure.calculator.service.LoginService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
@Transactional
@EnableAutoConfiguration
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public void registerUser(Login login){
        loginRepository.save(login);
    }
}
