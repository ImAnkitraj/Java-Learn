package com.tekion.spring.aop.service;

import com.tekion.spring.aop.repository.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {
        String res = dao1.retrievSomething();
        System.out.println(res);
        return res;
    }
}
