package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("librayBean", Library.class);
        Book book = context.getBean("book", Book.class);
        library.getBook();
//        library.returnMagazine();
        library.addBook("Ulan", book);
        library.addMagazine() ;
        library.getMagazine();

        context.close();
    }
}
