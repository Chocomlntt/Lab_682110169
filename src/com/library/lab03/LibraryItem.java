package com.library.lab03;

import java.time.LocalDate;

public class LibraryItem {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private String status;
    private LocalDate returnDate;
    private Member whoBook;

    public LibraryItem(String title, String author, String isbn, double price, String status){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
        this.status=status;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    public void displayDetails(){
        System.out.println(" -Title: "+title);
        System.out.println(" -Author: "+author);
        System.out.println(" -isbn: "+isbn);
        System.out.println(" -Price: "+price);
        System.out.println(" -Status: "+status);
        if (status.equalsIgnoreCase("Available")){
            System.out.println(" -Return Due Date: N/A (Book is available)");
        } else {
            System.out.println(" -Return Due Date: "+returnDate);
        }

    }
    public void checkOut(Member member){
        if ("Borrowed".equalsIgnoreCase(this.status)){
            System.out.println("Error: Book '"+this.title+"' is already borrowed and cannot be checked out again.");
            return;
        }
        if (member.getBookLimit() == 3){
//            Member Somsak has reached the borrow limit (3).
            System.out.println("Member "+member.getMemberName()+" has reached the borrow limit (3).");
            return;
        }else {
            member.setBookLimit(member.getBookLimit()+1);
        }
        this.whoBook= member;
        System.out.println("Book '"+title+"' has been checked out successfully.");
        this.status = "Borrowed";
//        Book Java Programming has been borrowed by Somsak.
        System.out.println("Book "+title+" has been borrowed by "+member.getMemberName()+".");
//        Return Due Date: 2026-02-04
        this.returnDate = LocalDate.now().plusDays(14);
        System.out.println("Return Due Date: "+this.returnDate);
    }

    public double calculateLateFee(int daylate){
        return daylate * 5;
    }

    public void printSummary(){
        System.out.println("Title='"+title+"'  Status='"+status+"'");
    }

    public void returnItem(){
        whoBook.setBookLimit(whoBook.getBookLimit()-1);
        this.status="Available";
        System.out.println("Item '"+title+"' has been returned successfully.");
    }
}
