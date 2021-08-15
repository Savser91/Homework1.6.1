package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Book book1 = new Book("Евгений Онегин", "Александр Пушкин", 150);
        System.out.println(book1.toString());
        book1.Print();
    }
}
