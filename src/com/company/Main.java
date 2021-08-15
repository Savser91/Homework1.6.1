package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Book book1 = new Book("Евгений Онегин", "Александр Пушкин", 150);
        Book book2 = new Book("Дубровский", "Александр Пушкин", 100);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        book1.Print();
        book2.Print();
    }
}
