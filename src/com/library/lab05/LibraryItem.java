package com.library.lab05;

import java.time.LocalDate;

public class LibraryItem {
    protected String title;
    protected String author;
    protected String isbn;
    protected double price;

    protected String status;
    protected Member borrower;
    protected LocalDate dueDate;

    public LibraryItem(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.status = "Available";
        this.borrower = null;
        this.dueDate = null;
    }

    public String getTitle() { return title; }
    public double getPrice() { return price; }

    public boolean isAvailable() { return "Available".equalsIgnoreCase(status); }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + status);
        System.out.println("Return Due Date: " + (dueDate == null ? "N/A (Item is available)" : dueDate));
    }

    public double calculateLateFee(int days) { return 0.0; }

    public void checkOut(Member member) {
        if (!isAvailable()) {
            System.out.println(" Error: Item '" + title + "' is already borrowed and cannot be checked out again.");
            return;
        }

        if (!member.canBorrow()) {
            System.out.println(" Member " + member.getName() + " has reached the borrow limit (" +
                    (member.canBorrow() ? "Unlimited" : "") + ") for " + " " + ".");
            System.out.println(" Borrow request denied for member " + member.getName() + ".");
            return;
        }

        this.status = "Borrowed";
        this.borrower = member;

        int loanDays = member.getLoanPeriodDays();
        this.dueDate = LocalDate.now().plusDays(loanDays);

        member.addBorrowedItem(this);

        System.out.println(" Item '" + title + "' has been checked out successfully.");
        System.out.println(" Borrowed by " + member.getName() + " (" + ")");
        System.out.println(" Loan Period: " + loanDays + " days");
        System.out.println(" Return Due Date: " + dueDate);
    }

    public void returnItem() {
        if (isAvailable()) {
            System.out.println(" Item '" + title + "' is already available.");
            return;
        }
        borrower.removeBorrowedItem(this);
        borrower = null;
        dueDate = null;
        status = "Available";
        System.out.println(" Item '" + title + "' has been returned successfully.");
    }
}