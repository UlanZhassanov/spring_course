package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* aop.Library.get*())")
//    private void allGetMethodsFromLibrary(){}
//
//    @Pointcut("execution(* aop.Library.return*())")
//    private void allReturnMethodsFromLibrary(){}
//
//    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
//    private void allGetAndReturnMethodsFromLibrary(){}
//
//
//
//    @Before("allReturnMethodsFromLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allGetMethodsFromLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #3");
//    }

}
