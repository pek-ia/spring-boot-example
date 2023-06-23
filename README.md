# spring-boot-example

## Demonstrates use of the most important Spring annotations

@Component

Annotates a Java class
Marks an important bean

@SpringBootApplication

Annotates a class
Marks the class that holds the main() method
Causes Spring to search the classpath for interesting beans


@Autowired

Annotation goes on:
    1. Constructor of a class that needs the bean
       Bean must be declared as a constructor parameter
    2. Instance variable of a class that needs the bean
       Bean must be declared as an instance variable
    3. (Deprecated) on a setter method
Injects an instance of a bean

@Configuration

Annotates a Java class
Marks the class that holds @Bean methods

@Primary

Annotates:
   1. A @Component class or
   2. A @Bean method of a @Configuration class
Marks which bean definition is the primary one if there are
   multiple definitions available


@Bean

Annotates a Java method
Marks a method that defines a bean instance


@Qualifier

Annotation goes on an injected bean at the point of injection
if injected by constructor, annotation goes on the parameter
If injected by instance variable, annotation goes on the variable