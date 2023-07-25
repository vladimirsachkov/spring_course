package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }

    protected String returnBook() {
        System.out.println("Мы возвращаем книгу");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
    }
}
