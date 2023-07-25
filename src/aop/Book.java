package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и накозание")
    private String name;

    @Value("Ф.М. Достоевский")
    private String author;

    @Value("1866")
    private int yerOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYerOfPublication() {
        return yerOfPublication;
    }
}
