package com.spring.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalSpeak {

    //Interface
    private Animal animal;

    //Dependency injection we are injecting the Animal interface into the AnimalSpeak class.
    @Autowired
    public AnimalSpeak(Animal animal) {
        this.animal = animal;
    }

    //Default Constructor
    public AnimalSpeak() {
    }


    //This is taking either dog or cat and calling the speak method.
    public void makeAnimalSpeak() {
        this.animal.speak();
    }
}
