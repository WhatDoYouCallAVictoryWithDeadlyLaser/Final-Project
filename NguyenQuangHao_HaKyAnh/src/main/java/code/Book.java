/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.Serializable;

public class Book implements Serializable {

    private String bookId;
    private String bookName;
    private double price;
    private String bookType;
    private int quantity;

    public Book(String bookId, String bookName, double price, String bookType, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.bookType = bookType;
        this.quantity = quantity;
    }

    public Book() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public double calculatePrice(int quantity) {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Price: " + price + ", Quantity " + quantity;
    }

}
