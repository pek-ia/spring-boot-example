package org.yearup.springbootexample;

import org.springframework.stereotype.Component;

@Component
public class Cow {
    public void speak(){
        System.out.println("MOOOOOOOOOO! Urp.");
    }
}
