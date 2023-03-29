package com.tekion.spring.aop.repository;

import com.tekion.spring.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    @TrackTime
    public String retrievSomething() {
        return "Dao2";
    }
}
