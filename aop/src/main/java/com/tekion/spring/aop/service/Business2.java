package com.tekion.spring.aop.service;

import com.tekion.spring.aop.repository.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        return dao2.retrievSomething();
    }
}
