package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAndAdvice() {
        System.out.println("beforeGetStudentsLoggingAndAdvice: логируем получение " +
                "списка студентов перед методом getStudents()");
    }

//    @AfterReturning(value = "execution(* getStudents())",
//        returning = "students")
//    public void afterReturningStudentsLoggingAndAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningStudentsLoggingAndAdvice: логируем получение " +
//                "списка студентов перед методом getStudents()");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())"
            , throwing = "exception")
    public void afterThrowingStudentsLoggingAndAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentsLoggingAndAdvice: логируем " +
                "исключение" + exception);
    }
}
