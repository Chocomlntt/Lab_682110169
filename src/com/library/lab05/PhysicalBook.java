package com.library.lab05;

public class PhysicalBook extends LibraryItem implements Taxable {

    private String shelfLocation;

    public PhysicalBook(String title, String author, String isbn, double price, String shelfLocation) {
        super(title, author, isbn, price);
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- PHYSICAL BOOK ---");
        super.displayDetails();
        System.out.println("Shelf Location: " + shelfLocation);
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 5.0;
    }

    @Override
    public double calculateTax() {
        return price * 0.07;
    }
}