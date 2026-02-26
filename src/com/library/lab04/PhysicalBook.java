package com.library.lab04;

public class PhysicalBook extends LibraryItem implements Taxable{
    private String shelfLocation;

    public PhysicalBook(String title, String author, String isbn, double price, String shelfLocation) {
        super(title, author, isbn, price, "Available");
        this.shelfLocation=shelfLocation;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" -ShelfLocation: "+shelfLocation);
        System.out.println();
    }

    @Override
    public void calculateTax() {

    }
}
