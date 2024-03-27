package com.johnny.spring.springcoredemo.common;

/**
 * Not a @Component bean. Must add the @Configuration bean
 * from the SportConfig class
 */
public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1,000 meters as a warm up";
    }
}
