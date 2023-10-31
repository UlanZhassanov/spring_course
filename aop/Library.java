package aop;

import org.springframework.stereotype.Component;

@Component("librayBean")
public class Library {
    public void getBook(){
        System.out.println("Get book");
    }
}
