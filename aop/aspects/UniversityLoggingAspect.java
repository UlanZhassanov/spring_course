package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void befotreGetStudentsLoggingAdvice(){
        System.out.println("befotreGetStudentsLoggingAdvice: logging getting student list before method getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students){
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);
        System.out.println("befotreGetStudentsLoggingAdvice: logging getting student list after method getStudents");
    }
}
