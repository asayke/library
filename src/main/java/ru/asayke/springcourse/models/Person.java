package ru.asayke.springcourse.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 25, message = "Name should be between 2 and 25 symbols")
    private String name;

    @Min(value = 0, message = "Year of birth should be greater than 0")
    private int yearOfBirth;

    public Person() {}

    public Person(int id, String name, int yearOfBirth){
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) { this.name= name; }

    public int getYearOfBirth() { return yearOfBirth; }

    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
