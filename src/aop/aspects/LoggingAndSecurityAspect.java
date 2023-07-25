package aop.aspects;

import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUnitLibrary() {
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUnitLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnReturnMagazineAdvice: Log #10");
    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){};
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUnitLibrary(){};
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUnitLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary () {
//    };
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUnitLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

//--

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
//;
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение " +
//                " книги/журнала");
//    }
}