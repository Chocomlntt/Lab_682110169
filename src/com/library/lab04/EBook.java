package com.library.lab04;

public class EBook extends LibraryItem implements DigitalContent,Taxable {
    private String downloadUrl;
    private double fileSize;

    public EBook(String title, String author, String isbn, String downloadUrl, double fileSize) {
        super(title, author, isbn, 99.0, "Available");
        this.downloadUrl=downloadUrl;
        this.fileSize=fileSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" -DownloadUrl: "+downloadUrl);
        System.out.println(" -FileSize: "+fileSize);
        System.out.println();
    }

    @Override
    public void streamOnline() {

    }

    @Override
    public void download() {

    }


    @Override
    public void calculateTax() {
        double price = 99.0;
        double taxRate = 0.05;
    }
}

