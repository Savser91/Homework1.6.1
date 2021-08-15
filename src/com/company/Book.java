package com.company;

public class Book {
    private String nameBook = "";
    private String authorBook = "";
    private int numberOfPages;

    public Book (String name, String author, int count) {
        nameBook = name;
        authorBook = author;
        numberOfPages = count;
    }

    public void Print() throws InterruptedException {
        for (int i = 0; i < numberOfPages; i++) {
            System.out.println(i);
            Thread.sleep(100);
        }
    }

    public String toString() {
        return "Информация о книге: " + nameBook + ", автор: " + authorBook + ", количество страниц - " +
                numberOfPages;
    }
}
