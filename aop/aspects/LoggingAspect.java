package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("MethodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("MethodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("MethodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if (obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println("Info about book: name - "+book.getName()+", author - "+book.getAuthor()+", year of publicaion - "+book.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Book added by "+obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: logging attempt to get book");
        System.out.println("--------------------------------------------");
    }

}
