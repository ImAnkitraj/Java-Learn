package com.tekion.spring.aop.repository;

import com.tekion.spring.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrievSomething() {
        return "Dao1";
    }
}
