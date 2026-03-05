package com.library.lab04;

public class LibraryMovie implements DigitalContent,Taxable{

    private String title;
    private String author;
    private String url;
    private int releaseYear;
    private String type;
    private double price;

    public LibraryMovie(String title, String author, String type, int releaseYear, String url, double price) {
        this.title = title;
        this.price = price;
        this.type = type;
        this.releaseYear = releaseYear;
        this.url = url;
        this.author = author;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public void streamOnline() {

    }

    @Override
    public void download() {

    }

    @Override
    public double calculateTax() {
        double price = getPrice();
        double taxRate = 0.05;
        return price*taxRate;
    }
}
