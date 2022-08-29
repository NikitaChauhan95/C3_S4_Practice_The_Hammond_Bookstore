/*
 *Author Name: Nikita Chauhan
 *Date: 27-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class Author {

    private String name;
    private String penName;

    public Author() {
    }

    public Author(String name, String penName) {
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
