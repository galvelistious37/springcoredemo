package com.johnny.spring.springcoredemo.rest;

import com.johnny.spring.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for dependency
    private Coach myCoach;

    // Field injection: not recommended by spring.io anymore because it makes testing harder
//    @Autowired
//    private Coach myCoach;

    // @Autowired tells spring to inject a dependency
    // Constructor injection:
    // - Use when required dependencies
    // - Generally recommended by the spring.io development team as a first choice
    // Define a constructor for dependency injection
//    // If multiple classes are set as components of Coach, one can be marked Primary
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    /**
     * @Qualifier("sameNameAsClassButStartWithLowerCase") sets
     * dependency injection for a specific bean
     * @param theCoach
     */
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
        myCoach = theCoach;
    }

//    // Setter Injection:
//    // - Use this when you have optional dependencies
//    // - If dependency is not provided, your app can provide reasonable default logic
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
