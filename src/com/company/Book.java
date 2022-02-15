package com.company;

class Book {
    private String title;
    private String author;
    private String genre;
    private int totalPages;
    static int numbooks;

    public Book(String title, String author, String genre, int totalPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.totalPages = totalPages;
        numbooks ++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }

    public void throwBookOnShelf(int a){
        System.out.println(this.getTitle() + " is magically thrown across the room to the spot numbered: " + a);
    }
}
