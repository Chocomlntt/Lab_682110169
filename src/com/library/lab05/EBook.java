package com.library.lab05;

public class EBook extends LibraryItem implements DigitalContent, Taxable {

    private String downloadUrl;
    private double fileSize;

    public EBook(String title, String author, String isbn, String downloadUrl, double fileSize) {
        super(title, author, isbn, 99.0); // default price
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- E-BOOK ---");
        super.displayDetails();
        System.out.println("URL: " + downloadUrl);
        System.out.println("Size: " + fileSize + " MB");
    }

    @Override
    public double calculateLateFee(int days) {
        return 0.0;
    }

    @Override
    public void streamOnline() {
        System.out.println("Streaming '" + title + "' from URL: " + downloadUrl);
    }

    @Override
    public void download() {
        System.out.println("Downloading '" + title + "' (" + fileSize + " MB)");
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }
}