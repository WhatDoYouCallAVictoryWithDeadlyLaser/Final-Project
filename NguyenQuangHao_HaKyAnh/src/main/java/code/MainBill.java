/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainBill implements Serializable {

    private LocalDateTime dateTime;
    private String customerId;
    private String customerName;
    private ArrayList<Bill> items;
    private float grandTotal;

    public MainBill() {
    }

    public MainBill(LocalDateTime dateTime, String customerId, String customerName, ArrayList<Bill> items, float grandTotal) {
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.customerName = customerName;
        this.items = items;
        this.grandTotal = grandTotal;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Bill> getItems() {
        return items;
    }

    public void setItems(ArrayList<Bill> items) {
        this.items = items;
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    private float calculateGrandTotal() {
        float total = 0;
        for (Bill item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public String generateBillText(DecimalFormat df) {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Header
        sb.append("Time: ").append(formatter.format(dateTime)).append("\n");
        sb.append("Customer ID: ").append(customerId).append("\n");
        sb.append("Customer Name: ").append(customerName).append("\n");
        sb.append("\nBook name\tQuantity\tPrice\tTotal Price\n");
        sb.append("--------------------------------------------------\n");

        // Items
        for (Bill fb : items) {
            sb.append(fb.getBookName()).append("\t")
                    .append(fb.getOrderQuantity()).append("\t")
                    .append(df.format(fb.getPrice())).append("\t")
                    .append(df.format(fb.getTotalPrice())).append("\n");
        }

        // Footer
        sb.append("--------------------------------------------------\n");
        sb.append("\nTotal: ").append(df.format(grandTotal));

        return sb.toString();
    }
    
    

}
