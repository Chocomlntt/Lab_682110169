package com.library.lab03;

import com.library.lab03.LibraryItem;

public class PhysicalBook extends LibraryItem {
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
        System.out.println(" -ShelfLocation: "+shelfLocation);
        System.out.println();
    }
}
