package org.yearup.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SayHello implements CommandLineRunner {

    @Autowired
    Cow c;

    @Autowired
    Cow c2;

    @Autowired
    Duck d;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
        // c = new Cow();
        c.speak();
        c2.speak();
        d.speak();
    }
}
