package com.johnny.spring.springcoredemo;

import org.springframework.stereotype.Component;

/**
 * @Component - marks the class as a Spring bean and makes it available
 * for dependency injection
 */
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
