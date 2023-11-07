package aop;

import org.springframework.stereotype.Component;

@Component("librayBean")
public class Library extends  AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("Get book");
        System.out.println("--------------------------------------------");
    }

    public String returnBook(){
        System.out.println("We return book");
        System.out.println("--------------------------------------------");
        return "War and peace";
    }

    public void getMagazine(){
        System.out.println("Get magazine");
        System.out.println("--------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazine");
        System.out.println("--------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("We add book to Library");
        System.out.println("--------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine to Library");
        System.out.println("--------------------------------------------");
    }
}
