/*
 *Author Name: Nikita Chauhan
 *Date: 27-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class Book {
    private long isbnNumber;
    private String title;
    private String description;
    private double price;

    public Book() {
    }

    public Book(long isbnNumber, String title, String description, double price) {

        this.isbnNumber = isbnNumber;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
