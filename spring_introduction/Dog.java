package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class Dog: init method");
//    }
//
//    //if scope=prototype, then dectroy method never called)
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }
}
