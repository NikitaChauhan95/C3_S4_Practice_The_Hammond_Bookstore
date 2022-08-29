/*
 *Author Name: Nikita Chauhan
 *Date: 28-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class BookImpl {

    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author("Chetan Bhagat", "Bhagat");


        book.setIsbnNumber(4321578L);
        book.setTitle("Traveller");
        book.setPrice(457.5);
        book.setDescription("This book is for WANDERERS");
        book.setAuthor(author);

        book.displayBookDetails();


    }

}
