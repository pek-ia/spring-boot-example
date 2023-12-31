package org.yearup.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SayOtherStuff implements CommandLineRunner {

    Cow c;

    Duck d;

    @Autowired
    SayOtherStuff(Cow c, @Qualifier("myPrettyDuck") Duck d){
        this.c = c;
        this.d = d;
    }

    @Override
    public void run(String... args) throws Exception {
        c.speak();
        System.out.println("Thank you, cow, for your bold opinions!");
        d.speak();
        System.out.println("Thank you, duck; I like you too!");

    }
}
