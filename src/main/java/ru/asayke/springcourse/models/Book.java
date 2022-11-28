package ru.asayke.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {

    private int id;

    @NotEmpty(message = "Author should not be empty")
    private String author;

    @NotEmpty(message = "Title name should not be empty")
    private String title;

    @Min(value = 0, message = "Year of release should be greater than 0")
    private int yearOfRelease;

    public Book() {}

    public Book(int id, String author, String title){
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getYearOfRelease() { return yearOfRelease; }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }
}