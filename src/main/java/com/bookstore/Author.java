/*
 *Author Name: Nikita Chauhan
 *Date: 27-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class Author extends Book {

    private String name;
    private String penName;

    public Author() {
    }

    public Author(long isbnNumber, String title, String description, double price, String name, String penName) {
        super(isbnNumber, title, description, price);
        this.name = name;
        this.penName = penName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", penName='" + penName + '\'' +
                '}';
    }
}
