package com.spring.microservices;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    // Dog speak method.
    public void speak() {
        System.out.println("Woof");
    }
}
