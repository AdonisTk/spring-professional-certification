package io.berkel.scalar.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Lord of the Rings")
    private String title;
    private String author;
    private float price;

    @Value("Tolkien")
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(@Value("22.15") float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
