package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Ulan Zhassanov",4,9.5);
        Student st2 = new Student("Ms Jackson",2,6.5);
        Student st3 = new Student("Kanye West",4,9.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Info from method getStudents");
        System.out.println(students);
        return students;
    }
}
