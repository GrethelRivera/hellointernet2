package com.careerdevs.hellointernet2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    private String routeRoute() {
        return "You requested the root route";
    }

    @GetMapping("/hello")
    private String helloRoute() {
        return "Hello CareerDevs!!!!";
    }

    @GetMapping ("/random")
    private int randomRoute () {
        return (int) (Math.random() * 100) + 1;
    }

    @GetMapping ("/joke")
    private String jokeRoute () {
        String [] jokes = {
                "What do you call a pig that does karate? A pork chop.",
                "Why do people say “break a leg” when you go on stage? Because every play has a cast.",
                "What do you call an alligator detective? An investi-gator.",
                "An SQL query goes into a bar, walks up to two tables, and asks, “Can I join you?”"
        };
int jokeIndex = (int) (Math.random() * jokes.length);
return jokes[jokeIndex];

    }
}


