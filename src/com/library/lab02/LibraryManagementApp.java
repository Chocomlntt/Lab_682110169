package com.library.lab02;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" LIBRARY MANAGEMENT SYSTEM - DEMONSTRATION");
        System.out.println("=".repeat(60));

        // Instantiate two book objects based on the provided raw data
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            books.add(new Book("Java Programming", "John Smith", "123-456", 450.0,
                    "Available"));
            books.add(new Book("OP Concepts", "ill Jones.", "999-888", 590.0,
                    "Available"));
        }
        // Instantiate member object
        Member member1 = new Member("M001", "Somsak");
        // Display initial details of both books
        System.out.println("\n--- Initial Book Information ---");
        for (Book book : books) {
            book.printSummary();
        }
    }
}
