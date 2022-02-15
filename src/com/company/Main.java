package com.company;


import java.io.PipedWriter;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("N", 17);
        Person person2 = new Person("Sam", 16);
        Book book1 = new Book("Goosebumps", "R.L. Stine", "Thriller", 100);
        Book book2 = new Book("Programming Logic", "Joyce Ferrell", "Horror", 550);
        person1.read(book1);
        book2.throwBookOnShelf(5);
        System.out.println(Book.numbooks);
    }
}
