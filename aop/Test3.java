package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("librayBean", Library.class);
        String bookName = library.returnBook();
        System.out.println("Book " + bookName + " returned to library");

        context.close();
        System.out.println("Method main ends");
    }
}
