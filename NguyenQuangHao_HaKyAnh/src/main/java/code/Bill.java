/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bill implements Serializable {

    private String bookName;
    private double price;
    private int orderQuantity;
    private double totalPrice;

    public Bill(String bookName, double price, int orderQuantity, double totalPrice) {
        this.bookName = bookName;
        this.price = price;
        this.orderQuantity = orderQuantity;
        this.totalPrice = totalPrice;
    }

    public Bill() {
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

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
