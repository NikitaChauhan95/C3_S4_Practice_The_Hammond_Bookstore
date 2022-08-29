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

    Author author;

    public Book() {
    }


    public Book(long isbnNumber, String title, String description, double price, Author author) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN Number is : " + isbnNumber);
        System.out.println("TITLE : " + title);
        System.out.println("PRICE : $" + price);
        System.out.println("DESCRIPTION : " + description);
        System.out.println("Author details : " + author);
    }
}
