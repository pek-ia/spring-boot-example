package org.yearup.springbootexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuckConfig {


    @Bean
    Duck myPrettyDuck(){
        Duck d = new Duck();
        d.setPretty(true);
        return d;
    }

}
